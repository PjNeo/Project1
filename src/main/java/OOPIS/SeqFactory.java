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
     * Hier soll die Unterscheidung zwischen den Unterklassen durchgeführt werden und
     * anschliessend die Funktion GetInformation aufruft.
     *
     * @param type
     *
     */
    public FastaRepresentation genSequences(SeqTypeEn type) {

            switch (type) {
                case DNA -> {

                    return new SeqDNA();
                }
                case RNA -> {
                    return new SeqRNA();
                }
                case PEPTIDE -> {
                    return new SeqPeptide();
                }
                case AMBIGUOUS -> {
                    return new SeqAmbiguous();
                }
                default -> {
                    throw new IllegalArgumentException("Wrong sequence type - DNA,RNA,Peptide are allowed");
                }
            }
        }

    }

