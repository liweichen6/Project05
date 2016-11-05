package project05;

import java.util.Arrays;

import student.TestCase;

/**
 * Test the SongReader class
 * 
 * @author Mingchi Li
 * @version 11/5/2016
 */
public class SongReaderTest extends TestCase
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
        String file1 = "SongList.csv";
        SongReader sr = new SongReader(file1);
        LinkedList<String[]> list = sr.readSongFile(file1);
        
       String[] info = list.getEntry(1);
       String[] song1 = list.getEntry(2);
       
       String str1 = Arrays.toString(info);
       String str2 = Arrays.toString(song1);
       
       assertEquals(str1, "[Song Title, Artist, Year, Genre]");
       assertEquals(str2, "[All These Things I've Done, "
               + "The Killers, 2005, alternative]");
    }
}
