/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */
package OOPIS;



/**
 * Einer der Unterklassen(SeqRNA) mit allen Methoden implementiert.
 * Die Rückgaben der Methoden wurden zunächst ohne Rückgabetypen
 * geschrieben.
 */
class SeqRNA extends FastaRepresentation {

    @Override
    public double meltingPointCal() {
        return 0;
    }

    /**
     * Methode zur Molekulargewichtsbestimmung
     *
     * @return double
     */

    public double molecularWeight() {
        double var =this.getsCounts().get('A')*329.2 +this.getsCounts().get('C')*305.2
                +this.getsCounts().get('G')*345.2 +this.getsCounts().get('U')*306.2
                +159;
        return var;
    }
    /**
     * Methode zur GCanteilsbestimmung
     *
     * @return double
     */
    public double gcContent() {
        double var = (double)
                (this.getsCounts().get('G')+this.getsCounts().get('C'))
                /(this.getLength());
        return var*100;
    }

    @Override
    public double netCharge(double pH) {
        return 0;
    }

}