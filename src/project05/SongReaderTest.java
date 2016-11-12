package project05;

import student.TestCase;

/**
 * Test the SongReader class
 * 
 * @author Mingchi Li
 * @version 11/5/2016
 */
public class SongReaderTest extends TestCase
{
    private LinkedList<Song> songList;
    
    /**
     * the setUp method
     */
    public void setUp()
    {
        String file1 = "SongList.csv";
        SongReader sr = new SongReader(file1);
        
        songList = sr.readSongFile(file1);
    }
    
    /**
     * Test readSureyFile method
     */
    public void testReadSureyFile()
    {
       Song song1 = songList.getEntry(1);
       String title = "All These Things I've Done";
       String artist = "The Killers";
       String year = "2005";
       String genre = "alternative";
       
       assertEquals(song1.getTitle(), title);
       assertEquals(song1.getArtist(), artist);
       assertEquals(song1.getDate(), year);
       assertEquals(song1.getGenre(), genre);
    }
    
    /**
     * Test readSureyFile method
     */
    public void testReadSureyFile2()
    {
       Song song2 = songList.getEntry(2);
       String title = "All You Need Is Love";
       String artist = "The Beatles";
       String year = "1967";
       String genre = "pop rock";
       
       assertEquals(song2.getTitle(), title);
       assertEquals(song2.getArtist(), artist);
       assertEquals(song2.getDate(), year);
       assertEquals(song2.getGenre(), genre);
       
       assertEquals(songList.getLength(), 59);
    }
}
