package prj5;

import java.util.Arrays;

import student.TestCase;

/**
 * test class for person class
 * 
 * @author Mingchi Li
 * @version 11/6/2016
 */
public class PersonTest extends TestCase
{
    private Person person;
    /**
     * the setUp method
     */
    public void setUp()
    {
        String[] info = {"1", "11/6/16", "Computer Science", 
                         "Outside of United States",
                         "sports", "Yes", "Yes", "Yes", "Yes"};
        person = new Person(info);
    }

    /**
     * test get Major method
     */
    public void testGetMajor()
    {
        MajorEnum major = person.getMajor();
        assertEquals(major, MajorEnum.CS);
    }

    /**
     * test the getHobby method
     */
    public void testGetHobby()
    {
        HobbyEnum hobby = person.getHobby();
        assertEquals(hobby, HobbyEnum.SPORT);
    }

    /**
     * test get region method
     */
    public void testGetRegion()
    {
        RegionEnum region = person.getRegion();
        assertEquals(region, RegionEnum.OUT_US);
    }
    
    /**
     * test getResponses
     */
    public void testGetResponses()
    {
        String[] str = person.getResponses();
        assertEquals(Arrays.toString(str), "[Yes, Yes, Yes, Yes]");
    }
    
    /**
     * test setResponseHeard
     */
    public void testSetResponseHeard()
    {
        String[] str = {"", "", "Computer Science", "Southeast", "music", ""};
        Person p1 = new Person(str);
        assertNotNull(p1);
        String[] str2 = {"", "", "Math or CMDA", "Northeast", "sports", ""};
        Person p2 = new Person(str2);
        assertNotNull(p2);
        String[] str3 = {"", "", "Other Engineering", "United States"
                + " (other than Southeast or Northwest)", "art", ""};
        Person p3 = new Person(str3);
        assertNotNull(p3);
        String[] str4 = {"", "", "Other", "Outside of United States",
                         "reading", ""};
        Person p4 = new Person(str4);
        assertNotNull(p4);
        
        String[] str5 = {"", "", "", "", "", ""};
        Person p5 = new Person(str5);
        assertNotNull(p5);
    }
}
