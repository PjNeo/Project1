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
class SeqRNA extends FastaRepresentation implements Calculateable {
    /**
     * Methode zur Schmelzpunkbestimmung
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
        double var =this.getaCount()*329.21 +this.getcCount()*305.2
                +this.getgCount()*345.2 +this.gettCount()*306.2
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
                (this.getgCount()+this.getcCount())
                /(this.getaCount()+this.getgCount()+this.getcCount()
                + this.gettCount()+this.getuCount());
        return var;
    }
    /**
     * Methode zur Nettoladungsberechnuung
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