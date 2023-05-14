package OOPIS;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map peptideMap = new HashMap();
        peptideMap.put("C", 8.33);
        peptideMap.put("D", 3.86);
        peptideMap.put("E", 4.25);
        peptideMap.put("H", 6.0);
        peptideMap.put("K", 10.53);
        peptideMap.put("R", 12.48);
        peptideMap.put("Y", 10.07);
        peptideMap.put("N-Term", 9.69);
        peptideMap.put("C-Term", 2.34);


        System.out.println("Hello world!");
        FastaAdministration n = new FastaAdministration();
        n.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/OOPIS/sample.fasta", "Dna");
        System.out.println(n.adminlist.get(0).gcContent());
        System.out.println(n.adminlist.get(0).molecularWeight());


    }
}