package project05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 * @author jacob
 *
 */
public class SongList
{
    private LinkedList<Song> songList;
    /**
     * 
     */
    public SongList(String fileName)
    {
        songList = toAlbum(fileName);
    }
    /**
     * 
     */
    public LinkedList<Song> toAlbum(String fileName)
    {
        LinkedList<Song> songList = new LinkedList<Song>();
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
                    songList.add(toAlbum);
                }
            }
            file.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return songList;
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
            for (int j = 1; j <= songList.getLength(); j++)
            {
                Song song = songList.getEntry(j);
                String heardOrNot = responses.getEntry(j + index1);
                String likedOrNot = responses.getEntry(j + index2);
                song.setResponseHeard(heardOrNot, person);
                song.setResponseLiked(likedOrNot, person);
                songList.replace(j, song);
                index1++;
                index2++;
            }
            index1 = 0;
            index2 = 1;
        }
    }
    
    /**
     * 
     */
    public LinkedList<Song> sortSongListByArtist()
    {
        for (int i = 1; i <= songList.getLength(); i++)
        {
            Song unsortedSong = songList.getEntry(i);
            String firstArtist = unsortedSong.getArtist();
            int position = i;
            while (position < songList.getLength())
            {
                if (firstArtist.compareTo(songList.getEntry(position + 1).getArtist()) > 0)
                {
                    firstArtist = songList.getEntry(position + 1).getArtist();
                }
                position++;
            }
            int loopCounter = 1;
            boolean foundSong = false;
            Song songFound = null;
            while (loopCounter <= songList.getLength() && !foundSong)
            {
                if (songList.getEntry(loopCounter).getArtist().equals(firstArtist))
                {
                    foundSong = true;
                    songFound = songList.getEntry(loopCounter);
                }
                else
                {
                    loopCounter++;
                }
            }
            songList.replace(loopCounter, unsortedSong);
            songList.replace(i, songFound);
        }
        return songList;
    }
    /**
     * 
     */
    public LinkedList<Song> sortSongListBySongTitle()
    {
        for (int i = 1; i <= songList.getLength(); i++)
        {
            Song unsortedSong = songList.getEntry(i);
            String firstTitle = unsortedSong.getTitle();
            int position = i;
            while (position < songList.getLength())
            {
                if (firstTitle.compareTo(songList.getEntry(position + 1).getTitle()) > 0)
                {
                    firstTitle = songList.getEntry(position + 1).getTitle();
                }
                position++;
            }
            int loopCounter = 1;
            boolean foundSong = false;
            Song songFound = null;
            while (loopCounter <= songList.getLength() && !foundSong)
            {
                if (songList.getEntry(loopCounter).getTitle().equals(firstTitle))
                {
                    foundSong = true;
                    songFound = songList.getEntry(loopCounter);
                }
                else
                {
                    loopCounter++;
                }
            }
            songList.replace(loopCounter, unsortedSong);
            songList.replace(i, songFound);
        }
        return songList;
    }
    /**
     * 
     */
    public LinkedList<Song> sortByGenre()
    {
        for (int i = 1; i <= songList.getLength(); i++)
        {
            Song unsortedSong = songList.getEntry(i);
            String firstGenre = unsortedSong.getGenre();
            int position = i;
            while (position < songList.getLength())
            {
                if (firstGenre.compareTo(songList.getEntry(position + 1).getGenre()) > 0)
                {
                    firstGenre = songList.getEntry(position + 1).getGenre();
                }
                position++;
            }
            int loopCounter = 1;
            boolean foundSong = false;
            Song songFound = null;
            while (loopCounter <= songList.getLength() && !foundSong)
            {
                if (songList.getEntry(loopCounter).getGenre().equals(firstGenre))
                {
                    foundSong = true;
                    songFound = songList.getEntry(loopCounter);
                }
                else
                {
                    loopCounter++;
                }
            }
            songList.replace(loopCounter, unsortedSong);
            songList.replace(i, songFound);
        }
        return songList;
    }
    /**
     * 
     */
    public void sortByDate()
    {
        for (int i = 1; i <= songList.getLength(); i++)
        {
            Song unsortedSong = songList.getEntry(i);
            String date = unsortedSong.getDate();
            int unsortedDate = Integer.parseInt(date);
            int position = i;
            while (position <= songList.getLength())
            {
                position++;
            }
            if (position != i)
            {
                Song swap = songList.getEntry(position);
                songList.replace(position, unsortedSong);
                songList.replace(i, swap);
            }
        }
    }
    /**
     * 
     */
    public LinkedList<Song> getSongList()
    {
        return songList;
    }
}
