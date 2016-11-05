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
     * read the song from file
     * 
     * @param fileName the file name
     * @return a list contain all the info of the song
     */
    public LinkedList<String[]> readSongFile(String fileName)
    {
        LinkedList<String[]> songList = new LinkedList<>();
        
        try
        {
            Scanner scanner = new Scanner(new File(fileName));
            
            while (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                String[] songInfo = str.split(",");
                songList.add(songInfo);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return songList;
    }
}
