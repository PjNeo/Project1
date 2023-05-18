/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */
package OOPIS;


/**
 * Einer der Unterklassen(SeqPeptide) mit allen Methoden implementiert.
 * Die Rückgaben der Methoden wurden zunächst ohne Rückgabetypen
 * geschrieben.
 */
class SeqPeptide extends FastaRepresentation  {
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
                     this.getsCounts().get('C')*this.getPeptideMap().get("C")
                    +this.getsCounts().get('D')*this.getPeptideMap().get("D")
                    +this.getsCounts().get('E')*this.getPeptideMap().get("E")
                    +this.getsCounts().get('H')*this.getPeptideMap().get("H")
                    +this.getsCounts().get('K')*this.getPeptideMap().get("K")
                    +this.getsCounts().get('R')*this.getPeptideMap().get("R")
                    +this.getsCounts().get('Y')*this.getPeptideMap().get("Y");

        double result = sum+ this.getPeptideMap().get("C-Term")+this.getPeptideMap().get("N-Term");


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
     *
     */
    @Override
    public void netCharge() {


    }
    /**
     * Methode zur Umwandlung in Amino
     */
    @Override
    public void transferToAmino() {

    }
}