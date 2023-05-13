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

}
