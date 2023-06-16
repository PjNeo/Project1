/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */

package OOPIS;


/**
 * Interface Calculateable, welches alle Methoden bereit stellt, die die Subclassen für
 * die verschiedenen  Berechnungen benötigt. Die Ergebnisse sollen dann in einer neu erstellten
 * fasta mit ausgegeben werden.
 */
public interface Calculateable {
    /**
     * Methode zur Schmelzpunkbestimmung
     * @return double
     */
    public double meltingPointCal();

    /**
     * Methode zur molekulargewichtsbestimmung
     *
     * @return double
     */
    public double molecularWeight();

    /**
     * Methode zur GCanteilsbestimmung
     *
     * @return double
     */
    public double gcContent();

    /**
     * Methode zur Nettoladungsberechnuung
     *
     * @return double
     */
    public double netCharge(double pH);

    /**
     * Methode zur Umwandlung in Amino
     */
    public void transferToAmino();


    /**
     *
     * @return double
     */
    public double pI(double pH );



}
