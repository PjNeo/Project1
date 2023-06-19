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
class SeqDNA extends FastaRepresentation {

    /**
     * Methode zur Schmelzpunkbestimmung
     * @return double
     */
    @Override
    public double meltingPointCal() {
        double var;
        if(this.getLength()< 14){
            var =
                    (this.getsCounts().get('A')+this.getsCounts().get('T'))*2+
                            ((this.getsCounts().get('G')+this.getsCounts().get('C'))*4);
        }else {
            var = 64.9 + ((41 * (this.getsCounts().get('G') + this.getsCounts().get('C') - 16.4))
                    / (this.getsCounts().get('A') + this.getsCounts().get('T') + this.getsCounts().get('G') + this.getsCounts().get('C')));
        }    return var;

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

    @Override
    public double netCharge(double pH) {
        return 0;
    }

    /**
     * Methode zur Umwandlung in Amino
     */

    public void transferToAmino() {
        //TODO
    }




}
