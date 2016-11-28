package prj5;

import java.util.Comparator;

/**
 * The album class
 * 
 * @author jacob
 * @version 11/5/2016
 *
 * @author Mingchi Li
 * @version 11/6/2016
 */
public class Album
{
    private LinkedList<Song> theAlbum;


    /**
     * Create a new album
     * 
     * @param songList a list of song
     */
    public Album(LinkedList<Song> songList)
    {
        theAlbum = songList;
    }


    /**
     * set the response for the song
     * 
     * @param personList a list of people
     */
    public void setSongResponse(LinkedList<Person> personList)
    {
        int songLength = theAlbum.getLength();
        int personLength = personList.getLength();
        for (int i = 1; i <= songLength; i++)
        {
            Song currentSong = theAlbum.getEntry(i);
            for (int j = 1; j <= personLength; j++)
            {
                Person currentPerson = personList.getEntry(j);
                String[] response = new String[songLength * 2];

                response = currentPerson.getResponses();

                currentSong.setResponseHeard(response[2 * i - 2],
                        currentPerson);
                currentSong.setResponseLiked(response[2 * i - 1],
                        currentPerson);

            }
        }
    }

    /**
     * Get the song list
     * 
     * @return the list of song
     */
    public LinkedList<Song> getAlbum()
    {
        return theAlbum;
    }

    /**
     * Sort the this album base on different property
     * 
     * @param <T> the type
     * @param p order of the sort
     */
    public <T> void sort(SongPropertyEnum p)
    {

        int l = theAlbum.getLength();
        for (int left = 1; left <= l; left++)
        {
            int right = 1;
            switch (p)
            {
                case ARTIST_NAME:
                    right = findSmallestName(left, l);
                    break;
                case SONG_TITLE:
                    right = findSmallestTitle(left, l);
                    break;
                case GENRE:
                    right = findSmallestGenre(left, l);
                    break;
                default:
                    right = findSmallestDate(left, l);   
            }
            swap(left, right);
        }
    }

    /**
     * Helper method to find the smallest element base on name
     * 
     * @param <T> type of the array
     * @param p1 first index
     * @param p2 last index
     * @return the smallest index
     */
    private <T> int findSmallestName(int p1, int p2)
    {
        StringAlphaComparator c = new StringAlphaComparator();
        int smallestIndex = p1;

        for (int i = p1 + 1; i <= p2; i++)
        { 
            if (c.compare(theAlbum.getEntry(i).getArtist(),
                    theAlbum.getEntry(smallestIndex).getArtist()) < 0)
            {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * Helper method to find the smallest element base on title
     * 
     * @param <T> type of the array
     * @param p1 first index
     * @param p2 last index
     * @return the smallest index
     */
    private <T> int findSmallestTitle(int p1, int p2)
    {
        StringAlphaComparator c = new StringAlphaComparator();
        int smallestIndex = p1;

        for (int i = p1 + 1; i <= p2; i++)
        { 
            if (c.compare(theAlbum.getEntry(i).getTitle(),
                    theAlbum.getEntry(smallestIndex).getTitle()) < 0)
            {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * Helper method to find the smallest element base on genre
     * 
     * @param <T> type of the array
     * @param p1 first index
     * @param p2 last index
     * @return the smallest index
     */
    private <T> int findSmallestGenre(int p1, int p2)
    {
        StringAlphaComparator c = new StringAlphaComparator();
        int smallestIndex = p1;

        for (int i = p1 + 1; i <= p2; i++)
        { 
            if (c.compare(theAlbum.getEntry(i).getGenre(),
                    theAlbum.getEntry(smallestIndex).getGenre()) < 0)
            {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * Helper method to find the smallest element base on Date
     * 
     * @param <T> type of the array
     * @param p1 first index
     * @param p2 last index
     * @return the smallest index
     */
    private <T> int findSmallestDate(int p1, int p2)
    {
        IntegerComparator c = new IntegerComparator();
        int smallestIndex = p1;

        for (int i = p1 + 1; i <= p2; i++)
        { 
            if (c.compare(theAlbum.getEntry(i).getDate(),
                    theAlbum.getEntry(smallestIndex).getDate()) < 0)
            {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * Swap two element in the album.
     * 
     * @param p1 first element index
     * @param p2 second element index
     */
    private <T> void swap(int p1, int p2)
    {
        Song s1 = theAlbum.getEntry(p1);
        Song s2 = theAlbum.getEntry(p2);

        theAlbum.replace(p1, s2);
        theAlbum.replace(p2, s1);
    }

    /**
     * Comparator that sorts integers
     */
    private class IntegerComparator implements Comparator<Integer> 
    {
        @Override
        public int compare(Integer i1, Integer i2) 
        {
            return i1 - i2;
        }
    }

    /**
     * Comparator that sorts Strings alphabetically
     */
    private class StringAlphaComparator implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2)
        {
            return s1.compareTo(s2);
        }
    }

    /**
     * The toString method
     * 
     * @return a string of the album
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 1; i <= theAlbum.getLength(); i++)
        {
            builder.append(theAlbum.getEntry(i).toString());
            if (i < theAlbum.getLength())
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * This will display all.
     * 
     * @param p the property of this person
     */
    public void display(PersonPropertyEnum p)
    {
        for (int i = 1; i <= theAlbum.getLength(); i++)
        {
            if (p == PersonPropertyEnum.HOBBY)
            {
                theAlbum.getEntry(i).display(p);
            }
            System.out.println();
        }
    }
}
