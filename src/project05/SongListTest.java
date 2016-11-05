package project05;
/**
 * 
 * @author jacob
 *
 */
public class SongListTest extends student.TestCase
{
    private SongList test;
    /**
     * 
     */
    public void setUp()
    {
        test = new SongList("input.txt");
    }
    /**
     * 
     */
    public void testToAlbum()
    {
        LinkedList<Song> list = new LinkedList<Song>();
        list.add(new Song("Led Zeppelin","Black Dog","rock","1971"));
        list.add(new Song("Nirvana", "Smells Like Teen Spirit", "grunge", "1991"));
        list.add(new Song("Tame Impala", "The Less I Know The Better", "psychedlic rock", "2016"));
        list.add(new Song("Chance The Rapper", "No Problems", "rap", "2016"));
        assertEquals(list.getEntry(1).getArtist(), test.toAlbum("input.txt").getEntry(1).getArtist());
        assertEquals(5, test.toAlbum("input.txt").getLength());
    }
    /**
     * 
     */
    public void testSortSongListByArtist()
    {
        LinkedList<Song> list = new LinkedList<Song>();
        list.add(new Song("Chance The Rapper", "No Problems", "rap", "2016"));
        list.add(new Song("Led Zeppelin", "Black Dog", "rock", "1971"));
        list.add(new Song("Nirvana", "Smells Like Teen Spirit", "grunge", "1991"));
        list.add(new Song("Sublime", "Santeria", "ska rock", "1996"));
        list.add(new Song("Tame Impala", "The Less I Know The Better", "psychedlic rock", "2016"));
        LinkedList<Song> songList = test.sortSongListByArtist();
        assertEquals(list.getEntry(1).getArtist(), songList.getEntry(1).getArtist());
        assertEquals(list.getEntry(2).getArtist(), songList.getEntry(2).getArtist());
        assertEquals(list.getEntry(3).getArtist(), songList.getEntry(3).getArtist());
        assertEquals(list.getEntry(4).getArtist(), songList.getEntry(4).getArtist());
        assertEquals(list.getEntry(5).getArtist(), songList.getEntry(5).getArtist());
    }
    /**
     * 
     */
    public void testSortSongListBySongTitle()
    {
        LinkedList<Song> list = new LinkedList<Song>();
        list.add(new Song("Led Zeppelin", "Black Dog", "rock", "1971"));
        list.add(new Song("Chance The Rapper", "No Problems", "rap", "2016"));
        list.add(new Song("Sublime", "Santeria", "ska rock", "1996"));
        list.add(new Song("Nirvana", "Smells Like Teen Spirit", "grunge", "1991"));
        list.add(new Song("Tame Impala", "The Less I Know The Better", "psychedlic rock", "2016"));
        LinkedList<Song> songList = test.sortSongListBySongTitle();
        assertEquals(list.getEntry(1).getTitle(), songList.getEntry(1).getTitle());
        assertEquals(list.getEntry(4).getTitle(), songList.getEntry(4).getTitle());
        assertEquals(list.getEntry(5).getTitle(), songList.getEntry(5).getTitle());
    }
    /**
     * 
     */
    public void testSortByGenre()
    {
        LinkedList<Song> list = new LinkedList<Song>();
        list.add(new Song("Nirvana", "Smells Like Teen Spirit", "grunge", "1991"));
        list.add(new Song("Tame Impala", "The Less I Know The Better", "psychedelic rock", "2016"));
        list.add(new Song("Chance The Rapper", "No Problems", "rap", "2016"));
        list.add(new Song("Led Zeppelin", "Black Dog", "rock", "1971"));
        list.add(new Song("Sublime", "Santeria", "ska rock", "1996"));
        LinkedList<Song> songList = test.sortByGenre();
        assertEquals(list.getEntry(1).getGenre(), songList.getEntry(1).getGenre());
        assertEquals(list.getEntry(4).getGenre(), songList.getEntry(4).getGenre());
        assertEquals(list.getEntry(5).getGenre(), songList.getEntry(5).getGenre());
    }
}
