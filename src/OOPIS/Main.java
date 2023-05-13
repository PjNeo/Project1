package OOPIS;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        FastaAdministration n = new FastaAdministration();
        n.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/OOPIS/sample.fasta", "Dna");
        System.out.println(n.adminlist.get(0).gcContent());
        System.out.println(n.adminlist.get(0).molecularWeight());


    }
}