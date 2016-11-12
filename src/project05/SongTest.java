package project05;

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
}
