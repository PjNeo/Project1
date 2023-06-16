/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */

package OOPIS;


import java.util.HashMap;
import java.util.Map;

/**
 * Die Repräsenetationsklasse die alle nötigen Attribute aufweist, sodass ein Object erschaffen werden kann,
 * das alle Informationen zur weiterverarbeitung beinhaltet. Diese Klasse soll die einzige sein von der Objekte
 * erschaffen werden können. Welche Subklasse angesprochen wird wird in SeqFaktory durch if abfragen geregelt.
*/
abstract class FastaRepresentation implements Calculateable {

    /**
     * Attribute die für die Spezifizierung eines fasta Eintrages wichtig sind.
     */
    private String seqID;

    private String seq;

    private String type;

    private Integer length;

    private String seqComposition;

    private Map<Character, Integer> sCounts = new HashMap<>();

    private Map<String,Double> peptideMap = new HashMap<>();



    public Map<String, Double> getPeptideMap() {
        return peptideMap;
    }
    public Map<Character, Integer> getsCounts() {
        return sCounts;
    }


    /**
     * Die Methode die die Hashmap mit Einträgen befüllt mit dem Alphabet der Sequenz
     * und wie oft der einzelne Charakter vorkommt.
     */
    public void fillsCounts() {

        this.sCounts.put('+', 1);
        this.sCounts.put('-', 1);

        for (int i = 0; i < this.getSeq().length(); i++) {
            if (this.getsCounts().containsKey(this.getSeq().charAt(i))) {
                this.getsCounts().put(this.getSeq().charAt(i), this.getsCounts().get(this.getSeq().charAt(i)) + 1);
            } else {
                this.getsCounts().put(this.getSeq().charAt(i), 1);
            }
        }
    }

    /**
     * Hier wird in der Settermethode der String für die segID modifiziert
     * um das überflüssige ">" zu entfernen. Der modifizierte String wird dann
     * in die seqID des Objektes geschrieben.
     * @param seqID
     */
    public void setSeqID(String seqID) {
        this.seqID = seqID.replace(">","");
    }

    /**
     * Getter Methode für die Sequenz des Objekts.
     * @return String
     */
    public String getSeq() {
        return seq;
    }
    /**
     * Getter Methode für die Sequenz ID des Objekts.
     * @return String
     */
    public String getSeqID() {
        return seqID;
    }
    /**
     * Setter Methode für die Sequenz des Objekts.
     */
    public void setSeq(String seq) {
        this.seq = seq;
    }
    /**
     * Getter Methode für die Sequenztypen des Objekts.
     * @return String
     */
    public String getType() {
        return type;
    }
    /**
     * Getter Methode für die Sequenz des Objekts.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Getter Methode für die Sequenzlänge des Objekts.
     * @return Integer
     */
    public Integer getLength() {
        return length;
    }
    /**
     * Getter Methode für die Sequenzzusammensetzung des Objekts
     * @return String
     */
    public String getSeqComposition() {
        return seqComposition;
    }

    public void setLength(int length) {
        this.length=length;
    }

    public double pI( double pH) {return 0.0;}


}
