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

    private String type;

    private Integer length;

    private String seqComposition;

    private int cCount;

    private int gCount;

    private int tCount;

    private int aCount;

    private int uCount;



    public int getaCount() {
        return aCount;
    }

    public void setaCount(int aCount) {
        this.aCount = aCount;
    }

    public int gettCount() {
        return tCount;
    }

    public void settCount(int tCount) {
        this.tCount = tCount;
    }

    public int getuCount() {
        return uCount;
    }

    public void setuCount(int uCount) {
        this.uCount = uCount;
    }

    public int getcCount() {
        return cCount;
    }

    public void setcCount(int cCount) {
        this.cCount = cCount;
    }



    public String getSeqID() {
        return seqID;
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
