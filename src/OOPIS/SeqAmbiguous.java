/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */

package OOPIS;




/**
 * Einer der Unterklassen(SeqAmbiguous) mit allen Methoden implementiert.
 * Die Rückgaben der Methoden wurden zunächst ohne Rückgabetypen
 * geschrieben.+
*/
class SeqAmbiguous extends FastaRepresentation  {
    /**
     * Methode zur Schmelzpunkbestimmung
     * @return double
     */
    @Override
    public double meltingPointCal() {

        return 0.0;
    }
    /**
     * Methode zur Molekulargewichtsbestimmung
     *
     * @return double
     */
    @Override
    public double molecularWeight() {

        double var =this.getsCounts().get('A')*313.21 +this.getsCounts().get('C')*289.18
                +this.getsCounts().get('G')*329.21 +this.getsCounts().get('T')*304.20
                -61.96;

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
                + this.getsCounts().get('T'));
        return var*100;
    }
    /**
     * Methode zur Nettoladungsberechnuung
     * @param pH
     * @return double
     */
    @Override
    public double netCharge(double pH) {
        System.out.println("Kann nicht auf diese Sequenz angewendet werden");
        return 0.0;
    }
    /**
     * Methode zur Umwandlung in Amino
     */
    @Override
    public void transferToAmino() {

    }
}