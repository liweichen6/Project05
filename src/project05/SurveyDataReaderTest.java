package project05;

import student.TestCase;

public class SurveyDataReaderTest extends TestCase
{
    private LinkedList<Person> personList;
    
    /**
     * the setUp method
     */
    public void setUp()
    {
        String file1 = "MusicSurveyDataTest1.csv";
        SurveyDataReader sdr = new SurveyDataReader(file1);
        personList = sdr.readSurveyFile(file1);
    }
    
    /**
     * test readSureyFile method
     */
    public void testReadSurveyFile()
    {
        Person person = personList.getEntry(1);
        Major major = person.getMajor();
        Hobby hobby = person.getHobby();
        Region region = person.getRegion();
        
        assertEquals(major, Major.MATH_OR_CDMA);
        assertEquals(hobby, Hobby.SPORT);
        assertEquals(region, Region.SE_US);
        
        assertEquals(personList.getLength(), 6);
    }
    
    /**
     * test readSureyFile method
     */
    public void testReadSurveyFile2()
    {
        Person person = personList.getEntry(6);
        Major major = person.getMajor();
        Hobby hobby = person.getHobby();
        Region region = person.getRegion();
        
        assertEquals(major, Major.CS);
        assertEquals(hobby, Hobby.MUSIC);
        assertEquals(region, Region.SE_US);
    }
    
    /**
     * Test readSureyFile when a student attribute is blank
     */
    public void testReadSurveyFile3()
    {
        String file1 = "MusicSurveyDataTest3.csv";
        SurveyDataReader sdr = new SurveyDataReader(file1);
        LinkedList<Person> personList2 = sdr.readSurveyFile(file1);
        
        assertEquals(personList2.getLength(), 3);
    }
}
