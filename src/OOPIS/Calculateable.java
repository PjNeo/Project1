/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */

package OOPIS;



/**
*Interface Calculateable, welches alle Methoden bereit stellt, die die Subclassen für
*die verschiedenen  Berechnungen benötigt. Die Ergebnisse sollen dann in einer neu erstellten
*fasta mit ausgegeben werden.
 */
public interface Calculateable {
    /**
     * Methode zur Schmelzpunkbestimmung
     */
    public double meltingPointCal();
    /**
     * Methode zur molekulargewichtsbestimmung
     *
     * @return
     */
    public double molecularWeight();
    /**
     * Methode zur GCanteilsbestimmung
     *
     * @return
     */
    public double gcContent();
    /**
     * Methode zur Nettoladungsberechnuung
     */
    public void netCharge();
    /**
     * Methode zur Umwandlung in Amino
     */
    public void transferToAmino();

}
