/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */
package OOPIS;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Einer der Unterklassen(SeqPeptide) mit allen Methoden implementiert.
 * Die Rückgaben der Methoden wurden zunächst ohne Rückgabetypen
 * geschrieben.
 */
class SeqPeptide extends FastaRepresentation {

    private static final List<String> nTerminusIndexes = new ArrayList<>();
    private static final List<String> cTerminusIndexes = new ArrayList<>();

    static {

        nTerminusIndexes.addAll(List.of("R", "H", "K", "N-Term"));


        cTerminusIndexes.addAll(List.of("D", "E", "C", "Y", "C-Term"));

    }


    /**
     * Methode zur Schmelzpunkbestimmung
     *
     * @return double
     */
    @Override
    public double meltingPointCal() {
        System.out.println("Kann nicht auf diese Sequenz angewendet werden");
        return 0.0;
    }

    /**
     * Methode zur Molekulargewichtsbestimmung
     *
     * @return double
     */
    @Override
    public double molecularWeight() {

        double sum =
                this.getsCounts().get('C') * this.getPeptideMap().get("C")
                        + this.getsCounts().get('D') * this.getPeptideMap().get("D")
                        + this.getsCounts().get('E') * this.getPeptideMap().get("E")
                        + this.getsCounts().get('H') * this.getPeptideMap().get("H")
                        + this.getsCounts().get('K') * this.getPeptideMap().get("K")
                        + this.getsCounts().get('R') * this.getPeptideMap().get("R")
                        + this.getsCounts().get('Y') * this.getPeptideMap().get("Y");

        double result = sum + this.getPeptideMap().get("C-Term") + this.getPeptideMap().get("N-Term");


        return result;
    }

    /**
     * Methode zur GCanteilsbestimmung
     *
     * @return double
     */
    @Override
    public double gcContent() {
        System.out.println("Kann nicht auf diese Sequenz angewendet werden");
        return 0.0;
    }

    /**
     * Methode zur Nettoladungsberechnuung
     *
     * @param pH
     * @return double
     */
    public double netCharge(double pH) {
        AtomicReference<Double> sumNTerminus = new AtomicReference<>(0.0);

        getPeptideMap()
                .forEach((key, pKa) -> {
                    if (key.equals("N-Term")) {
                        var tmpAdd = (1 * (Math.pow(10, pKa)
                                / (Math.pow(10, pH) + Math.pow(10, pKa))));
                        sumNTerminus.updateAndGet(v -> (v + tmpAdd));

                    } else if (SeqPeptide.nTerminusIndexes.contains(key) && getsCounts().containsKey(key.charAt(0))) {
                        sumNTerminus.updateAndGet(v -> (v + this.getsCounts().get(key.charAt(0)) *
                                (
                                        Math.pow(10, pKa)
                                                / (Math.pow(10, pH) + Math.pow(10, pKa))
                                )
                        ));
                    } else {
                        sumNTerminus.updateAndGet(v -> (v + (0 * (Math.pow(10, pKa)
                                / (Math.pow(10, pH) + Math.pow(10, pKa))))));
                    }
                });

        AtomicReference<Double> sumCTerminus = new AtomicReference<>(0.0);

        getPeptideMap()
                .forEach((key, pKa) -> {
                    if (key.equals("C-Term")) {
                        sumCTerminus.updateAndGet(
                                v -> (v + (
                                        1 * (Math.pow(10, pH) / (Math.pow(10, pH) + Math.pow(10, pKa)))
                                )
                                ));
                    } else if (SeqPeptide.cTerminusIndexes.contains(key) && getsCounts().containsKey(key.charAt(0))) {
                        sumCTerminus.updateAndGet(v -> (v + (this.getsCounts().get(key.charAt(0)) * (Math.pow(10, pH)
                                / (Math.pow(10, pH) + Math.pow(10, pKa))))));
                    }
//                    else {
//                        sumCTerminus.updateAndGet(v -> (v + (0 * (Math.pow(10, pH)
//                                / (Math.pow(10, pH) + Math.pow(10, pKa))))));
//                    }
                });

//        double sum1 = 1 * (
//                Math.pow(10, this.getPeptideMap().get("N-Term"))
//                        / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("N-Term"))))
//                + (this.getsCounts().get('R') * Math.pow(10, this.getPeptideMap().get("R"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("R"))))
//                + (this.getsCounts().get('K') * Math.pow(10, this.getPeptideMap().get("K"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("K"))))
//                + (this.getsCounts().get('H') * Math.pow(10, this.getPeptideMap().get("H"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("H"))));
//
//        double sum2 = (1 * Math.pow(10, this.getPeptideMap().get("C-Term"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("C-Term"))))
//                + (this.getsCounts().get('D') * Math.pow(10, this.getPeptideMap().get("D"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("D"))))
//                + (this.getsCounts().get('E') * Math.pow(10, this.getPeptideMap().get("E"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("E"))))
//                + (this.getsCounts().get('C') * Math.pow(10, this.getPeptideMap().get("C"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("C"))))
//                + (this.getsCounts().get('Y') * Math.pow(10, this.getPeptideMap().get("Y"))
//                / (Math.pow(10, 7) + Math.pow(10, this.getPeptideMap().get("Y"))));
//
//
//        double result = sum1 - sum2;

        return sumNTerminus.get() - sumCTerminus.get();
    }

    public double pI(final double pH) {
        if (isApproximatelyZero(this.netCharge(pH))) {
            return pH;
        }

        if (this.netCharge(pH) < 0) {
            return pI(pH - pH / 2);
        } else {
            return pI(pH + pH / 2);
        }
    }

    public boolean isApproximatelyZero(double value) {
        return Math.abs(value) <= 0.01;
    }

    /**
     * Methode zur Umwandlung in Amino
     */
    @Override
    public void transferToAmino() {

    }
}