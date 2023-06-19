package OOPIS;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;


public class Project1Test {

    @Test
    public void calcTestDNA() throws FastaCheckException {
        FastaAdministration test =  new FastaAdministration();
        test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/DNAtest.fasta", "DNA");


        assertEquals(50.0,test.adminlist.get(0).gcContent());
        assertEquals(1173.84,test.adminlist.get(0).molecularWeight());
        assertEquals(12.0,test.adminlist.get(0).meltingPointCal());



    }

    @Test
    public void testFastaFile() throws FastaCheckException {
        FastaAdministration test =  new FastaAdministration();

        assertThrows(FastaCheckException.class, () ->  test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/DNA1test.fasta", "DNA"));

    }
    @Test
    public void seqType() throws WrongtypeException, FastaCheckException {
        FastaAdministration test = new FastaAdministration();
        boolean hasRightType = true;
        try {
            test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/RNAtest.fasta", "RNA");
        }catch (WrongtypeException wte){
            hasRightType =false;
        }
        assertTrue(hasRightType);
        assertThrows(WrongtypeException.class, () ->  test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/DNAtest.fasta", "RNA"));

    }

    @Test
    public void calcTestRNA() throws FastaCheckException {
        FastaAdministration test = new FastaAdministration();
        test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/RNAtest.fasta", "RNA");


        assertEquals(50.0,test.adminlist.get(0).gcContent());
        assertEquals(1444.8,test.adminlist.get(0).molecularWeight());
    }
    @Test
    public void calcTestPeptide() throws FastaCheckException {
        FastaAdministration test = new FastaAdministration();
        test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/Peptidetest.fasta", "Peptide");


        assertEquals(0.952155341950633, test.adminlist.get(0).netCharge(7));
        assertEquals(8.87789387595775, test.adminlist.get(0).pI(7));
    }
}
