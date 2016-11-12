package project05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read the song info from the file
 * 
 * @author Mingchi Li
 * @version 11/5/2016
 */
public class SongReader 
{
    /**
     * Create a new SongReader
     * 
     * @param fileName the file name
     */
    public SongReader(String fileName)
    {
        this.readSongFile(fileName);
    }
    
    /**
     * Read the song from file
     * 
     * @param fileName the file name
     * @return a list contain all the info of the song
     */
    public LinkedList<Song> readSongFile(String fileName)
    {
        LinkedList<String[]> songInfoList = new LinkedList<>();
        
        try
        {
            Scanner scanner = new Scanner(new File(fileName));
            
            while (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                String[] songInfo = str.split(",");
                songInfoList.add(songInfo);
            }

            scanner.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return toAlbum(songInfoList);
    }
    
    /**
     * Create song list using string list
     * 
     * @param songList the data need to process
     * @return a list of song
     */
    private LinkedList<Song> toAlbum(LinkedList<String[]> songList)
    {
        LinkedList<Song> album = new LinkedList<Song>();
        
        int l = songList.getLength();
        
        for (int i = 2; i <= l; i++)
        {
            String[] info = songList.getEntry(i);
            album.add(new Song(info[0], info[1], Integer.parseInt(info[2]), info[3]));
        }
        
        return album;
    }
}
