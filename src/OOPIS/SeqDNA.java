/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */
package OOPIS;


/**
 * Einer der Unterklassen(SeqDNA) mit allen Methoden implementiert.
 * Die Rückgaben der Methoden wurden zunächst ohne Rückgabetypen
 * geschrieben um Fehler im Code zu vermeiden.
 */
class SeqDNA extends FastaRepresentation implements Calculateable {

    /**
     * Methode zur Schmelzpunkbestimmung
     * @return double
     */
    @Override
    public double meltingPointCal() {
        double var;
        if(this.getLength()< 14){
            var =
                    (this.getaCount()+this.gettCount())*2+
                            (this.getgCount()+this.getcCount())*4;
        }else{
            var =  64.9+((41 * (this.getgCount() + this.getcCount() - 16.4))
                    /(this.getaCount() + this.gettCount()+this.getgCount()+this.getcCount()));
        }
        return var;
    }

    /**
     * Methode zur Molekulargewichtsbestimmung
     *
     * @return double
     */
    @Override
    public double molecularWeight() {

        double var =this.getaCount()*313.21 +this.getcCount()*289.18
                    +this.getgCount()*329.21 +this.gettCount()*304.20
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
                (this.getgCount()+this.getcCount())
                /(this.getaCount()+this.getgCount()+this.getcCount()
                + this.gettCount()+this.getuCount());
        return var*100;

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