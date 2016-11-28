package prj5;

import java.util.Arrays;

import student.TestCase;

/**
 * Test class of the Song
 * 
 * @author Mingchi Li
 * @version 11/7/2016
 */
public class SongTest extends TestCase
{
    private Song song;

    /**
     * The setUp method
     */
    public void setUp()
    {
        song = new Song("Title", "Name", 2016, "Genre");
    }

    /**
     * Test getTitle method
     */
    public void testGetTitle()
    {
        String str = "Title";
        assertEquals(str, song.getTitle());
    }

    /**
     * Test the getDate method
     */
    public void testGetDate()
    {
        int date = 2016;
        assertEquals(date, song.getDate());
    }

    /**
     * Test getArtist method
     */
    public void testGetArtist()
    {
        String name = "Name";
        assertEquals(name, song.getArtist());
    }

    /**
     * Test getGenre method
     */
    public void testGenre()
    {
        String genre = "Genre";
        assertEquals(genre, song.getGenre());
    }

    /**
     * test equals method
     */
    public void testEquals()
    {
        assertTrue(song.equals(song));

        String nullString = null;
        assertFalse(song.equals(nullString));

        assertFalse(song.equals("song"));

        Song s = new Song("Title", "Name", 2016, "Genre");

        Song s1 = new Song("title", "Name", 2016, "Genre");
        Song s2 = new Song("Title", "name", 2016, "Genre");
        Song s3 = new Song("Title", "Name", 2015, "Genre");
        Song s4 = new Song("Title", "Name", 2016, "genre");

        assertFalse(song.equals(s1));
        assertFalse(song.equals(s2));
        assertFalse(song.equals(s3));
        assertFalse(song.equals(s4));

        assertTrue(song.equals(s));
    }

    /**
     * Test the toString method
     */
    public void testToString()
    {
        String str = "[Title Name 2016 Genre]";
        assertEquals(song.toString(), str);
    }

    /**
     * test display method
     */
    public void testDisplay()
    {
        assertNotNull(song);
        song.display(PersonPropertyEnum.HOBBY);
        System.out.println("------------------");
    }

    /**
     * test display method
     */
    public void testDisplay2()
    {
        assertNotNull(song);
        song.display(PersonPropertyEnum.MAJOR);
        System.out.println("------------------");
    }

    /**
     * test display method
     */
    public void testDisplay3()
    {
        assertNotNull(song);
        song.display(PersonPropertyEnum.REGION);
    }


    /**
     * test getNumHeardMajors
     */
    public void testGetNumHeardMajors()
    {
        int[] a = song.getNumHeardMajors();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getNumLikedMajors
     */
    public void testGetNumLikedMajors()
    {
        int[] a = song.getNumLikedMajors();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getNumHeardHobby
     */
    public void testGetNumHeardHobby()
    {
        int[] a = song.getNumHeardHobby();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getNumLikedHobby
     */
    public void testGetNumLikedHobby()
    {
        int[] a = song.getNumLikedHobby();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getNumHeardRegion
     */
    public void testGetNumHeardRegion()
    {
        int[] a = song.getNumHeardRegion();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getNumLikedRegion
     */
    public void testGetNumLikedRegion()
    {
        int[] a = song.getNumLikedRegion();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getTotalHeardMajor
     */
    public void testGetTotalHeardMajor()
    {
        int[] a = song.getTotalHeardMajor();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getTotalHeardHobby
     */
    public void testTotalHeardHobby()
    {
        int[] a = song.getTotalHeardHobby();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getTotalHeardRegion
     */
    public void testTotalHeardRegion()
    {
        int[] a = song.getTotalHeardRegion();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getTotalLikedMajor
     */
    public void testTotalLikedMajor()
    {
        int[] a = song.getTotalLikedMajor();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getTotalLikedHobby
     */
    public void testTotalLikedHobby()
    {
        int[] a = song.getTotalLikedHobby();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }

    /**
     * test getTotalLikedRegion
     */
    public void testTotalLikedRegion()
    {
        int[] a = song.getTotalLikedRegion();
        assertEquals("[0, 0, 0, 0]", Arrays.toString(a));
    }
    
    /**
     * test getHobbyData method
     */
    public void testGetHobbyData()
    {
        int[] a = song.getHobbyData();
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", 
                     Arrays.toString(a));
    }
    
    /**
     * test getHobbyData method
     */
    public void testGetMajorData()
    {
        int[] a = song.getMajorData();
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", 
                     Arrays.toString(a));
    }
    
    /**
     * test getHobbyData method
     */
    public void testGetRegionData()
    {
        int[] a = song.getRegionData();
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", 
                     Arrays.toString(a));
    }

    /**
     * test setResponseHeard
     */
    public void testSetResponseHeard()
    {
        String[] str = {"", "", "Computer Science", "Southeast", "music", ""};
        Person p1 = new Person(str);
        song.setResponseHeard("Yes", p1);
        song.setResponseLiked("Yes", p1);
        assertNotNull(p1);
        String[] str2 = {"", "", "Math or CMDA", "Northeast", "sports", ""};
        Person p2 = new Person(str2);
        song.setResponseHeard("Yes", p2);
        song.setResponseLiked("Yes", p2);
        assertNotNull(p2);
        String[] str3 = {"", "", "Other Engineering", "United States"
                + " (other than Southeast or Northwest)", "art", ""};
        Person p3 = new Person(str3);
        song.setResponseHeard("Yes", p3);
        song.setResponseLiked("Yes", p3);
        assertNotNull(p3);
        String[] str4 = {"", "", "Other", "Outside of United States",
                         "reading", ""};
        Person p4 = new Person(str4);
        song.setResponseHeard("Yes", p4);
        song.setResponseLiked("Yes", p4);
        assertNotNull(p4);
        String[] str5 = {"", "", "Other", "Outside of United States",
                         "reading", ""};
        Person p5 = new Person(str5);
        song.setResponseHeard("", p5);
        song.setResponseLiked("No", p5);
        assertNotNull(p5);

        String[] str6 = {"", "", "Other", "Outside of United States",
                         "reading", ""};
        Person p6 = new Person(str6);
        song.setResponseHeard("No", p6);
        song.setResponseLiked("", p6);
        assertNotNull(p6);
    }

}
