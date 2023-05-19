/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */
package OOPIS;

/**
 * Hier soll die Unterscheidung zwischen den Unterklassen durchgeführt werden und
 * anschliessend die Funktion GetInformation aufruft.
*/
public class SeqFactory {
    /**
     *  Hier soll die Unterscheidung zwischen den Unterklassen durchgeführt werden und
     *  anschliessend die Funktion GetInformation aufruft.
     * @return Object
     */
    public FastaRepresentation genSequences(String type) {

        if (type.equalsIgnoreCase("DNA")) {
            return new SeqDNA();
        } else if (type.equalsIgnoreCase("RNA")) {
            return new SeqRNA();
        } else if (type.equalsIgnoreCase("Ambiguous")) {
            return new SeqAmbiguous();
        } else if (type.equalsIgnoreCase("Peptide")) {
            return new SeqPeptide();
        }

        throw new IllegalArgumentException("Wrong sequence type - RNA,Ambiguous,Peptide are allowed");
    }
}
