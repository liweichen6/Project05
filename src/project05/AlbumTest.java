package project05;

import java.util.Arrays;

import student.TestCase;

/**
 * The test class for Album class
 * 
 * @author jacob
 * @version 11/5/2016
 *
 * @author Mingchi Li
 * @version 11/6/2016
 */
public class AlbumTest extends TestCase
{
    private Album album;
    private LinkedList<Song> songList;
    private LinkedList<Person> personList;
    
    /**
     * The setUp method
     */
    public void setUp()
    {
        String file1 = "SongListTest1.csv";
        SongReader sr = new SongReader(file1);
        songList = sr.readSongFile(file1);
        
        String file2 = "MusicSurveyDataTest1.csv";
        SurveyDataReader sdr = new SurveyDataReader(file2);
        personList = sdr.readSurveyFile(file2);
        
        album = new Album(songList);
        album.setSongResponse(personList);
    }
    
    
    
    /**
     * Test the setSongResponse method
     */
    public void testSetSongResponse()
    {
        LinkedList<Song> a = album.getAlbum();
        Song song1 = a.getEntry(1);
        
        //[Computer Science, Other Engineering, Math or CMDA, Other]
        int[] hearedMajor = song1.getNumHeardMajors();
        assertEquals(Arrays.toString(hearedMajor), "[1, 0, 1, 0]");
        
        //[Read, Art, Sports, Music]
        int[] hearedHobby = song1.getNumHeardHobby();
        assertEquals(Arrays.toString(hearedHobby), "[0, 0, 2, 0]");
        
        //[Northeast US, Southeast US, the rest of US, outside the US]
        int[] hearedRegion = song1.getNumHeardRegion();
        assertEquals(Arrays.toString(hearedRegion), "[0, 2, 0, 0]");
              
        //[Computer Science, Other Engineering, Math or CMDA, Other]
        int[] likedMajor = song1.getNumLikedMajors();
        assertEquals(Arrays.toString(likedMajor), "[2, 0, 1, 0]");
        
        //[Read, Art, Sports, Music]
        int[] likedHobby = song1.getNumLikedHobby();
        assertEquals(Arrays.toString(likedHobby), "[0, 0, 2, 1]");
        
        //[Northeast US, Southeast US, the rest of US, outside the US]
        int[] likedRegion = song1.getNumLikedRegion();
        assertEquals(Arrays.toString(likedRegion), "[0, 3, 0, 0]");
    }
    
    /**
     * Test the setSongResponse method
     */
    public void testSetSongResponse2()
    {
        LinkedList<Song> a = album.getAlbum();
        Song song5 = a.getEntry(5);
        
        //[Computer Science, Other Engineering, Math or CMDA, Other]
        int[] hearedMajor = song5.getNumHeardMajors();
        assertEquals(Arrays.toString(hearedMajor), "[3, 0, 3, 0]");
        
        //[Read, Art, Sports, Music]
        int[] hearedHobby = song5.getNumHeardHobby();
        assertEquals(Arrays.toString(hearedHobby), "[1, 0, 4, 1]");
        
        //[Northeast US, Southeast US, the rest of US, outside the US]
        int[] hearedRegion = song5.getNumHeardRegion();
        assertEquals(Arrays.toString(hearedRegion), "[0, 6, 0, 0]");
        
        //[Computer Science, Other Engineering, Math or CMDA, Other]
        int[] likedMajor = song5.getNumLikedMajors();
        assertEquals(Arrays.toString(likedMajor), "[2, 0, 1, 0]");
        
        //[Read, Art, Sports, Music]
        int[] likedHobby = song5.getNumLikedHobby();
        assertEquals(Arrays.toString(likedHobby), "[1, 0, 1, 1]");
        
        //[Northeast US, Southeast US, the rest of US, outside the US]
        int[] likedRegion = song5.getNumLikedRegion();
        assertEquals(Arrays.toString(likedRegion), "[0, 3, 0, 0]");
    }
    
    
    /**
     * Test the sort method by name
     */
    public void testSortName()
    {
        album.sort(SongProperty.ARTIST_NAME);
        
        Song song1 = album.getAlbum().getEntry(1);
        assertEquals(song1.getTitle(), "American Pie");
        
        Song song5 = album.getAlbum().getEntry(5);
        assertEquals(song5.getTitle(), "Anarchy in the UK");
    }
    
    /**
     * Test the sort method by date
     */
    public void testSortDate()
    {
        album.sort(SongProperty.DATE);
        
        Song song1 = album.getAlbum().getEntry(1);
        assertEquals(song1.getTitle(), "All You Need Is Love");
        
        Song song5 = album.getAlbum().getEntry(5);
        assertEquals(song5.getTitle(), "All These Things I've Done");
    }
    
    /**
     * Test the sort method by genre
     */
    public void testSortGenre()
    {
        album.sort(SongProperty.GENRE);
        
        Song song1 = album.getAlbum().getEntry(1);
        assertEquals(song1.getTitle(), "All These Things I've Done");
        
        Song song5 = album.getAlbum().getEntry(5);
        assertEquals(song5.getTitle(), "Anarchy in the UK");
    }
    
    /**
     * Test the sort method by genre
     */
    public void testSortTitle()
    {
        album.sort(SongProperty.SONG_TITLE);
        
        Song song1 = album.getAlbum().getEntry(1);
        assertEquals(song1.getTitle(), "All These Things I've Done");
        
        Song song5 = album.getAlbum().getEntry(5);
        assertEquals(song5.getTitle(), "Another One Bites the Dust");
    }
}
