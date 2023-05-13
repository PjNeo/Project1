/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */

package OOPIS;




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

    public String getSeqID() {
        return seqID;
    }

    public void setSeqID(String seqID) {
        this.seqID = seqID;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
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

    private String type;

    private Integer length;

    private String seqComposition;

}
