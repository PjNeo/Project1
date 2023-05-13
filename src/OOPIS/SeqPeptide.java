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
class SeqPeptide extends FastaRepresentation implements Calculateable {
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
     * @return
     */
    @Override
    public double molecularWeight() {

        return 0;
    }
    /**
     * Methode zur GCanteilsbestimmung
     *
     * @return
     */
    @Override
    public double gcContent() {

        return 0;
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