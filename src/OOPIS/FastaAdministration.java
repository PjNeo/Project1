/**
 * @author Philip Newman
 * Geschrieben am 04.05.2023
 */
package OOPIS;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
* Hier werden Objekte erstellt und mit den ausgelesenen Daten befüllt und abschließend abgespeichert.
 * Hier sollen zunächst die fasta Datei geöffnet werden. Danach wird zeilenweise über die geöffnete
 * Datei iteriert. Mit If Bedingungen wird geprüft welche Zeilen die benötigten Informationen
 * enthalten. So sucht man zunächst nach ">" um daraus den Seqenztyp und SequenzID
 * herauszulesen und in ein ,in dieser Klasse erschaffenes Objekt der Klasse FastaRepräsentation, abzuspeichern.
 * Die nächsten Zeilen enthalten dann die Sequenz, diese wird in dem zugehörigen(mit dem zuvor gespeicherten
 * Typ und der ID) Objekt gespeichert. Anschliessend soll die Länge und Zusammensetzung
 * (Alphabet und vielleicht könnte zusätlich noch die einzelnen Buchstaben gezählt werden dies benötigt
 * allerdings eine weiter Variable) der Sequnez ermittelt werden und zusätzlich in
 * dem Objekt gespeichert werden. So werden alle Sequenzen mit den Informationen in einzelnen Objekten gespeichert.
 * Alle Objekte von der Repräsentationsklasse werden dann in einer adminlist gespeichert und bekommen einen
 * jeweiligen Index.
*/

public class FastaAdministration {
    
    /**
     * attribut adminlist mit dem Datentyp FastaRepresentation um alle erschaffenen Objekte zu speichern
     */
    private ArrayList<FastaRepresentation> adminlist= new ArrayList<>();
    



    /**
     * Getter Methode um die adminlist anzeigen zulassen.
     */
    private ArrayList<FastaRepresentation> getAdminlist() {
        return this.adminlist;
    }



    /**
     * Hier sollen die Objekte erschaffen werden und die Informationen ausgelesen werden.
     * Ausserdem in die jeweiligen Objekte gespeichert werden.
     * @return String
     * @param
     *
     */
    public String getInformation(String dateiname, String type) {


        try {
            int counter = -1;
            String seqSammeln=null;
            Scanner scanner = new Scanner(new File(dateiname));
            SeqFactory factory = new SeqFactory();

            while(scanner.hasNext()) {

                String line = scanner.nextLine();

                if ( line.startsWith(">")){
                    FastaRepresentation header = factory.genSequences(type);
                    header.setSeqID(line);
                    adminlist.add(header);
                    seqSammeln="";
                    counter++;

                } else {

                    seqSammeln += line;
                    adminlist.get(counter).setSeq(seqSammeln);

                }
            }
            for (FastaRepresentation object : adminlist){
                object.setLength(object.getSeq().length());
            }


            scanner.close();
        }

        catch(Exception e) {
            return "e";
        }

        return "";
    }


    /**
     * Hier sollen dann später die berechneten Daten in eine fasta Datei geschrieben werden.
     *
     */
    public void rewriteFasta(){

    }
    
}
