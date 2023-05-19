package OOPIS;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        FastaAdministration sequences = new FastaAdministration();
        sequences.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/OOPIS/sample.fasta", "Peptide");
        for (FastaRepresentation element: sequences.adminlist) {
            if (element instanceof SeqPeptide){
                System.out.println(((SeqPeptide) element).pI(7.0));
            }
        }
//        n.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/OOPIS/sample.fasta", "Dna");
//        System.out.println(n.adminlist.get(0).gcContent());
//        System.out.println(n.adminlist.get(0).molecularWeight());
//        n.adminlist.get(0);

//        SeqPeptide s = new SeqPeptide();
//        FastaAdministration admin = FastaAdministration.getInstance();
//
//
//        s.setSeq("AKVYA");
//        s.getsCounts();



    }
}