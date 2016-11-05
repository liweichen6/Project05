package project05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Album
{
    private LinkedList<Song> album;
    /**
     * 
     */
    public Album(LinkedList<String[]> songList)
    {
        album = toAlbum(songList);
    }
    
    /**
     * 
     */
    public LinkedList<Song> toAlbum(LinkedList<String[]> songList)
    {
        LinkedList<Song> album = new LinkedList<Song>();
        
        int l = songList.getLength();
        
        for (int i = 2; i <= l; i++)
        {
            
        }
        
        return album;
    }
    /**
     * 
     * @param people
     */
    public void setSongResponse(LinkedList<Person> people)
    {
        int index1 = 0;
        int index2 = 1;
        for (int i = 1; i <= people.getLength(); i++)
        {
            Person person = people.getEntry(i);
            LinkedList<String> responses = person.getResponses();
            for (int j = 1; j <= album.getLength(); j++)
            {
                Song song = album.getEntry(j);
                String heardOrNot = responses.getEntry(j + index1);
                String likedOrNot = responses.getEntry(j + index2);
                song.setResponseHeard(heardOrNot, person);
                song.setResponseLiked(likedOrNot, person);
                album.replace(j, song);
                index1++;
                index2++;
            }
            index1 = 0;
            index2 = 1;
        }
    }
}
