package project05;
/**
 * 
 * @author jacob
 *
 */
public class AlbumTest extends student.TestCase
{
    private Album testAlbum;
    private Album testAlbum2;
    /**
     * 
     */
    public void setUp()
    {
        testAlbum = new Album("input.txt");
        testAlbum2 = new Album("SongListTest1.csv");
    }
    /**
     * 
     */
    public void testToAlbum()
    {
        LinkedList<Song> list = new LinkedList<Song>();
        list.add(new Song("Led Zeppelin","Black Dog","rock","1971"));
        list.add(new Song("Nirvana", "Smells Like Teen Spirit", "grunge", "1991"));
        assertEquals(list.getEntry(1).getArtist(), testAlbum.toAlbum("input.txt").getEntry(1).getArtist());
        assertEquals(2, testAlbum.toAlbum("input.txt").getLength());
    }
    
}
