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
    /**
     * Methode zur Schmelzpunkbestimmung
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
        double var =this.getsCounts().get('A')*329.21 +this.getsCounts().get('C')*305.2
                +this.getsCounts().get('G')*345.2 +this.getsCounts().get('U')*306.2
                +159;
        return var;
    }
    /**
     * Methode zur GCanteilsbestimmung
     *
     * @return double
     */
    @Override
    public double gcContent() {
        double var = (double)
                (this.getsCounts().get('G')+this.getsCounts().get('C'))
                /(this.getsCounts().get('A')+this.getsCounts().get('G')+this.getsCounts().get('C')
                + this.getsCounts().get('U'));
        return var*100;
    }
    /**
     * Methode zur Nettoladungsberechnuung
     */
    @Override
    public void netCharge() {

        System.out.println("Kann nicht auf diese Sequenz angewendet werden");
    }
    @Override
    public void transferToAmino() {

    }
}