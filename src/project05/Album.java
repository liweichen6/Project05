package project05;

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
    private LinkedList<Song> album;
    
    /**
     * Create a new album
     * 
     * @param a list of song
     */
    public Album(LinkedList<Song> songList)
    {
        album = songList;
    }

    /**
     * set the response for the song
     * 
     * @param personList a list of people
     */
    public void setSongResponse(LinkedList<Person> personList)
    {
        int songLength = album.getLength();
        int personLength = personList.getLength();
        for (int i = 1; i <= songLength; i++)
        {
            Song currentSong = album.getEntry(i);
            for (int j = 1; j <= personLength; j++)
            {
                Person currentPerson = personList.getEntry(j);
                String[] response = new String[songLength * 2];
                
                response = currentPerson.getResponses();
                currentSong.setResponseHeard(response[2 * i - 2], currentPerson);
                currentSong.setResponseLiked(response[2 * i - 1], currentPerson);
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
        return album;
    }
    
    /**
     * Sort the this album base on different property
     * 
     * @param <T> the type
     * @param p order of the sort
     * @param c a comparator
     */
    public <T> void sort(SongProperty p)
    {
        
        int l = album.getLength();
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
                case DATE:
                    right = findSmallestDate(left, l);
            }
            swap(left, right);
        }
    }
    
    /**
     * Helper method to find the smallest element base on name
     * 
     * @param <T> type of the array
     * @param a the array need to sort
     * @param p1 first index
     * @param p2 last index
     * @param c the comparator
     * @return the smallest index
     */
    private <T> int findSmallestName(int p1, int p2)
    {
        StringAlphaComparator c = new StringAlphaComparator();
        int smallestIndex = p1;
        
        for (int i = p1 + 1; i <= p2; i++)
        { 
            if(c.compare(album.getEntry(i).getArtist(),
                    album.getEntry(smallestIndex).getArtist()) < 0)
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
     * @param a the array need to sort
     * @param p1 first index
     * @param p2 last index
     * @param c the comparator
     * @return the smallest index
     */
    private <T> int findSmallestTitle(int p1, int p2)
    {
        StringAlphaComparator c = new StringAlphaComparator();
        int smallestIndex = p1;
        
        for (int i = p1 + 1; i <= p2; i++)
        { 
            if(c.compare(album.getEntry(i).getTitle(),
                    album.getEntry(smallestIndex).getTitle()) < 0)
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
     * @param a the array need to sort
     * @param p1 first index
     * @param p2 last index
     * @param c the comparator
     * @return the smallest index
     */
    private <T> int findSmallestGenre(int p1, int p2)
    {
        StringAlphaComparator c = new StringAlphaComparator();
        int smallestIndex = p1;
        
        for (int i = p1 + 1; i <= p2; i++)
        { 
            if(c.compare(album.getEntry(i).getGenre(),
                    album.getEntry(smallestIndex).getGenre()) < 0)
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
     * @param a the array need to sort
     * @param p1 first index
     * @param p2 last index
     * @param c the comparator
     * @return the smallest index
     */
    private <T> int findSmallestDate(int p1, int p2)
    {
        IntegerComparator c = new IntegerComparator();
        int smallestIndex = p1;
        
        for (int i = p1 + 1; i <= p2; i++)
        { 
            if(c.compare(album.getEntry(i).getDate(),
                    album.getEntry(smallestIndex).getDate()) < 0)
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
        Song s1 = album.getEntry(p1);
        Song s2 = album.getEntry(p2);
        
        album.replace(p1, s2);
        album.replace(p2, s1);
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
        for (int i = 1; i <= album.getLength(); i++)
        {
            builder.append(album.getEntry(i).toString());
            if (i < album.getLength())
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
