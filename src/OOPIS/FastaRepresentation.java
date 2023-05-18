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




    public Map<Character, Integer> getsCounts() {
        return sCounts;
    }

    public void setsCounts(Map<Character, Integer> sCounts) {
        this.sCounts = sCounts;
    }

    public void fillsCounts() {

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

    public String getSeq() {
        return seq;
    }

    public String getSeqID() {
        return seqID;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getgCount() {
        return gCount;
    }

    public void setgCount(int gCount) {
        this.gCount = gCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSeqComposition() {
        return seqComposition;
    }

    public void setSeqComposition(String seqComposition) {
        this.seqComposition = seqComposition;
    }



}
