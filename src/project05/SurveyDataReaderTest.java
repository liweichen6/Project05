package project05;

import java.util.Arrays;

import student.TestCase;

public class SurveyDataReaderTest extends TestCase
{
    /**
     * the setUp method
     */
    public void setUp()
    {
        // nothing
    }
    
    /**
     * test readSureyFile method
     */
    public void testReadSureyFile()
    {
        String file1 = "MusicSurveyData.csv";
        SurveyDataReader sdr = new SurveyDataReader(file1);
        LinkedList<String[]> list = sdr.readSureyFile(file1);
        
        String str = Arrays.toString(list.getEntry(2));
        assertEquals(str, "[1, 10/14/15 10:11, Math or CMDA, Southeast, sports,"
                + " Yes, Yes, Yes, No, Yes, No, No, No, Yes, No, Yes, Yes, Yes, No,"
                + " No, No, No, No, Yes, Yes, No, No, Yes, Yes, No, No, Yes, Yes, "
                + "Yes, Yes, No, No, No, No, Yes, , No, No, Yes, No, No, No, No, No,"
                + " No, No, No, No, Yes, Yes, No, No, Yes, Yes, , , Yes, Yes, No, No, "
                + "No, No, No, No, Yes, Yes, No, No, No, No, Yes, No, No, No, Yes, Yes, "
                + "No, No, Yes, Yes, Yes, No, No, No, No, No, Yes, Yes, Yes, Yes, No, "
                + "No, No, No, No, No, No, No, No, No, Yes, Yes, No, No, Yes, Yes, No, "
                + "No, No, No, No, No, Yes, No, Yes, Yes, No, No]");
    }
}
