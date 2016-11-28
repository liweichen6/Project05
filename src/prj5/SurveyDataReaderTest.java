package prj5;

import student.TestCase;

/**
 * test class for the SurveyDataReader class
 * @author Mingchi Li
 * @version 11/13/2016
 */
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
        MajorEnum major = person.getMajor();
        HobbyEnum hobby = person.getHobby();
        RegionEnum region = person.getRegion();

        assertEquals(major, MajorEnum.MATH_OR_CDMA);
        assertEquals(hobby, HobbyEnum.SPORT);
        assertEquals(region, RegionEnum.SE_US);

        assertEquals(personList.getLength(), 6);
    }

    /**
     * test readSureyFile method
     */
    public void testReadSurveyFile2()
    {
        Person person = personList.getEntry(6);
        MajorEnum major = person.getMajor();
        HobbyEnum hobby = person.getHobby();
        RegionEnum region = person.getRegion();

        assertEquals(major, MajorEnum.CS);
        assertEquals(hobby, HobbyEnum.MUSIC);
        assertEquals(region, RegionEnum.SE_US);
    }

    /**
     * Test readSureyFile when a student attribute is blank
     */
    public void testReadSurveyFile3()
    {
        String file = "MusicSurveyDataTest3.csv";
        SurveyDataReader sdr = new SurveyDataReader(file);
        LinkedList<Person> personList2 = sdr.readSurveyFile(file);

        assertEquals(personList2.getLength(), 3);
    }
    
    /**
     * Test read file
     */
    public void testReadSurveyFile4()
    {
        String file = "MusicSurveyDataTest1.csv";
        SurveyDataReader sdr = new SurveyDataReader(file);
        LinkedList<Person> personList2 = sdr.readSurveyFile(file);

        assertEquals(personList2.getLength(), 6);
    }
    
    /**
     * Test read file
     */
    public void testReadSurveyFile5()
    {
        String file = "MusicSurveyDataNoGenreRepeats.csv";
        SurveyDataReader sdr = new SurveyDataReader(file);
        LinkedList<Person> personList2 = sdr.readSurveyFile(file);

        assertEquals(personList2.getLength(), 205);
    }
}
