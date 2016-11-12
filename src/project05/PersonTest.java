package project05;

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
                "Outside of United States", "sports", "Yes", "Yes", "Yes", "Yes"};
        person = new Person(info);
    }
    
    /**
     * test get Major method
     */
    public void testGetMajor()
    {
        Major major = person.getMajor();
        assertEquals(major, Major.CS);
    }
    
    /**
     * test the getHobby method
     */
    public void testGetHobby()
    {
        Hobby hobby = person.getHobby();
        assertEquals(hobby, Hobby.SPORT);
    }
    
    /**
     * test get region method
     */
    public void testGetRegion()
    {
        Region region = person.getRegion();
        assertEquals(region, Region.OUT_US);
    }
}
