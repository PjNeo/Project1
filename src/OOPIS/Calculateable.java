/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */

package OOPIS;



/**
*Interface Calculateable, welches alle Methoden bereit stellt, die die Subclassen für
*die verschiedenen  Berechnungen benötigt. Die Ergebnisse sollen dann in einer neu erstellten
*fasta mit ausgegeben werden..
 */
public interface Calculateable {

    /**
     * Methode zur Schmelzpunkbestimmung
     */
    public void meltingPointCal();
    /**
     * Methode zur molekulargewichtsbestimmung
     */
    public void  molecularWeight();
    /**
     * Methode zur GCanteilsbestimmung
     */
    public void gcContent();
    /**
     * Methode zur Nettoladungsberechnuung
     */
    public void netCharge();
    /**
     * Methode zur Umwandlung in Amino
     */
    public void transferToAmino();

}
