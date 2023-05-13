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
        FastaRepresentation seq = null;

        if (type.equalsIgnoreCase("DNA")) {
            seq = new SeqDNA();
        } else if (type.equalsIgnoreCase("RNA")) {
            seq = new SeqRNA();
        } else if (type.equalsIgnoreCase("Ambiguous")) {
            seq = new SeqAmbiguous();
        } else if (type.equalsIgnoreCase("Peptide")) {
            seq = new SeqPeptide();
        }return seq;


    }
}
