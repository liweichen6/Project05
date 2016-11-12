package project05;

/**
 * The song class
 * 
 * @author jacob
 * @version 11/5/2016
 *
 * @author Mingchi Li
 * @version 11/6/2016
 */
public class Song
{
    private String artist;
    private String title;
    private String genre;
    private int date;

    private int[] numHeardMajors;
    private int[] numHeardHobby;
    private int[] numHeardRegion;

    private int[] numLikedMajors;
    private int[] numLikedHobby;
    private int[] numLikedRegion;

    /**
     * Create a new song object
     * 
     * @param t title of the song
     * @param a artist of the song
     * @param d date of the song
     * @param g genre of the song
     */
    public Song(String t, String a, int d, String g)
    {
        title = t;
        artist = a;
        date = d;
        genre = g;

        numHeardMajors = new int[4];
        numHeardHobby = new int[4];
        numHeardRegion = new int[4];

        numLikedMajors = new int[4];
        numLikedHobby = new int[4];
        numLikedRegion = new int[4];
    }

    /**
     * Get the artist of this song
     * 
     * @return the artist
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Get the title of this song
     * 
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Get the genre of this song
     * 
     * @return the genre
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Get the date of this song
     * 
     * @return the date
     */
    public int getDate()
    {
        return date;
    }

    /**
     * 
     * @param person
     */
    public void setResponseHeard(String heardOrNot, Person person)
    {
        Hobby personHobby = person.getHobby();
        Major personMajor = person.getMajor();
        Region personRegion = person.getRegion();

        if (heardOrNot.equals("Yes"))
        {
            switch (personHobby)
            {
            case READ:
                numHeardHobby[0]++;
                break;
            case ART:
                numHeardHobby[1]++;
                break;
            case SPORT:
                numHeardHobby[2]++;
                break;
            case MUSIC:
                numHeardHobby[3]++;
            }
            switch (personMajor)
            {
            case CS:
                numHeardMajors[0]++;
                break;
            case OTHER_ENGE:
                numHeardMajors[1]++;
                break;
            case MATH_OR_CDMA:
                numHeardMajors[2]++;
                break;
            case OTHER:
                numHeardMajors[3]++;
            }
            switch (personRegion)
            {
            case NE_US:
                numHeardRegion[0]++;
                break;
            case SE_US:
                numHeardRegion[1]++;
                break;
            case R_US:
                numHeardRegion[2]++;
                break;
            case OUT_US:
                numHeardRegion[3]++;
            }
        }
    }

    public void setResponseLiked(String likedOrNot, Person person)
    {
        Hobby personHobby = person.getHobby();
        Major personMajor = person.getMajor();
        Region personRegion = person.getRegion();

        if (likedOrNot.equals("Yes"))
        {
            switch (personHobby)
            {
            case READ:
                numLikedHobby[0]++;
                break;
            case ART:
                numLikedHobby[1]++;
                break;
            case SPORT:
                numLikedHobby[2]++;
                break;
            case MUSIC:
                numLikedHobby[3]++;
            }
            switch (personMajor)
            {
            case CS:
                numLikedMajors[0]++;
                break;
            case OTHER_ENGE:
                numLikedMajors[1]++;
                break;
            case MATH_OR_CDMA:
                numLikedMajors[2]++;
                break;
            case OTHER:
                numLikedMajors[3]++;
            }
            switch (personRegion)
            {
            case NE_US:
                numLikedRegion[0]++;
                break;
            case SE_US:
                numLikedRegion[1]++;
                break;
            case R_US:
                numLikedRegion[2]++;
                break;
            case OUT_US:
                numLikedRegion[3]++;
            }
        }
    }

    /**
     * Get the info of the heard person by majors
     * 
     * @return the info of heard person by majors
     */
    public int[] getNumHeardMajors()
    {
        return numHeardMajors;
    }

    /**
     * Get the info of the liked person by majors
     * 
     * @return the info of liked person by majors
     */
    public int[] getNumLikedMajors()
    {
        return numLikedMajors;
    }

    /**
     * Get the info of the heard person by hobby
     * 
     * @return the info of heard person by hobby
     */
    public int[] getNumHeardHobby()
    {
        return numHeardHobby;
    }

    /**
     * Get the info of the liked person by hobby
     * 
     * @return the info of liked person by hobby
     */
    public int[] getNumLikedHobby()
    {
        return numLikedHobby;
    }

    /**
     * Get the info of the heard person by region
     * 
     * @return the info of heard person by region
     */
    public int[] getNumHeardRegion()
    {
        return numHeardRegion;
    }

    /**
     * Get the info of the liked person by region
     * 
     * @return the info of liked person by region
     */
    public int[] getNumLikedRegion()
    {
        return numLikedRegion;
    }


    /**
     * Equals method
     * @return is equal
     */
    @Override
    public boolean equals(Object other) 
    {
        if (other == this) 
        {
            return true;
        }
        if ((other == null) || (other.getClass() != Song.class)) 
        {
            return false;
        }
        Song temp = (Song) other;
        return temp.getArtist().equals(this.getArtist())
                && temp.getTitle().equals(this.getTitle())
                && temp.getDate() == this.getDate()
                && temp.getGenre().equals(this.getGenre());
    } 

    /**
     * The toString method
     * 
     * @return the title of this song
     */
    @Override
    public String toString()
    {
        return "[" + title + " " + artist 
                + " " + date + " " + genre + "]";
    }
}
