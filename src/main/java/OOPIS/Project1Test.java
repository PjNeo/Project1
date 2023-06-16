package OOPIS;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;


public class Project1Test {

    @Test
    public void calcTestDNA() throws FastaCheckException {
        FastaAdministration test = FastaAdministration.getInstance();
        test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/DNAtest.fasta", "DNA");


        assertEquals(50.0,test.adminlist.get(0).gcContent());
        assertEquals(1173.84,test.adminlist.get(0).molecularWeight());
        assertEquals(12.0,test.adminlist.get(0).meltingPointCal());



    }

    @Test
    public void testgetInfExcep() throws FastaCheckException {
        FastaAdministration test = FastaAdministration.getInstance();

        assertThrows(FastaCheckException.class, () ->  test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/DNA1test.fasta", "DNA"));

    }

    @Test
    public void calcTestRNA() throws FastaCheckException {
        FastaAdministration test = FastaAdministration.getInstance();
        test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/RNAtest.fasta", "RNA");


        assertEquals(50.0,test.adminlist.get(0).gcContent());
        assertEquals(1444.8,test.adminlist.get(0).molecularWeight());
    }
    @Test
    public void calcTestPeptide() throws FastaCheckException {
        FastaAdministration test = FastaAdministration.getInstance();
        test.getInformation("/Users/philipnewman/IdeaProjects/Project1/src/main/java/OOPIS/Peptidetest.fasta", "Peptide");


        assertEquals(0.9968388513224302, test.adminlist.get(0).netCharge(7));
        assertEquals(0.9968388513224302, test.adminlist.get(0).pI(7));
    }
}
