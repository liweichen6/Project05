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
    public Album(String fileName)
    {
        album = toAlbum(fileName);
    }
    /**
     * 
     */
    public LinkedList<Song> toAlbum(String fileName)
    {
        LinkedList<Song> album = new LinkedList<Song>();
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                String name = "";
                String genre = "";
                String date = "";
                String artist = "";
                int index = 1;
                for (int i = 0 ; i < line.length(); i++)
                {
                    if (line.charAt(i) == ',')
                    {
                        index++;
                    }
                    else
                    {
                        if (index == 1)
                        {
                            name = name + line.charAt(i);
                        }
                        else if (index == 2)
                        {
                            artist = artist + line.charAt(i);
                        }
                        else if (index == 3)
                        {
                            date = date + line.charAt(i);
                        }
                        else
                        {
                            genre = genre + line.charAt(i);
                        }
                    }
                }
                if (!artist.equals(""))
                {
                    Song toAlbum = new Song(artist, name, genre, date);
                    album.add(toAlbum);
                }
            }
            file.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
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
