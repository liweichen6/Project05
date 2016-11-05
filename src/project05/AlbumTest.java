package project05;
/**
 * 
 * @author jacob
 *
 */
public class AlbumTest extends student.TestCase
{
    private Album testAlbum;
    /**
     * 
     */
    public void setUp()
    {
        testAlbum = new Album("input.txt");
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
