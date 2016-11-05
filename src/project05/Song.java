package project05;
/**
 * 
 * @author jacob
 *
 */
public class Song
{
    private String artist;
    private String title;
    private String genre;
    private String date;
    private int[] numHeardMajors;
    private int[] numLikedMajors;
    private int[] numHeardHobby;
    private int[] numLikedHobby;
    private int[] numHeardRegion;
    private int[] numLikedRegion;
    /**
     * 
     */
    public Song(String artist, String title, String genre, String date)
    {
        super();
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.date = date;
        numHeardMajors = new int[4];
        numLikedMajors = new int[4];
        numLikedHobby = new int[4];
        numHeardHobby = new int[4];
        numHeardRegion = new int[4];
        numLikedRegion = new int[4];
        
    }
    /**
     * 
     * @return
     */
    public String getArtist()
    {
        return artist;
    }
    /**
     * 
     * @return
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * 
     * @return
     */
    public String getGenre()
    {
        return genre;
    }
    /**
     * 
     * @return
     */
    public String getDate()
    {
        return date;
    }
    /**
     * 
     * @return
     */
    /**
     * 
     * @param person
     */
    public void setResponseHeard(String heardOrNot, Person person)
    {
        Hobby personHobby = person.hobby();
        Major personMajor = person.major();
        Region personRegion = person.region();
        if (heardOrNot.equals("yes"))
        {
            switch (personHobby)
            {
                case music:
                    numHeardHobby[0] = numHeardHobby[0] + 1;
                case sport:
                    numHeardHobby[1] = numHeardHobby[1] + 1;
                case art:
                    numHeardHobby[2] = numHeardHobby[2] + 1;
                case read:
                    numHeardHobby[3] = numHeardHobby[3] + 1;
            }
            switch (personMajor)
            {
                case cs:
                    numHeardMajors[0] = numHeardMajors[0] + 1;
                case oe:
                    numHeardMajors[1] = numHeardMajors[1] + 1;
                case math:
                    numHeardMajors[2] = numHeardMajors[2] + 1;
                case cmda:
                    numHeardMajors[2] = numHeardMajors[2] + 1;
                default:
                    numHeardMajors[3] = numHeardMajors[3] + 1;
            }
            switch (personRegion)
            {
                case neus:
                    numHeardRegion[0] = numHeardRegion[0] + 1;
                case seus:
                    numHeardRegion[1] = numHeardRegion[1] + 1;
                case rus:
                    numHeardRegion[2] = numHeardRegion[2] + 1;
                case ous:
                    numHeardRegion[3] = numHeardRegion[3] + 1;
            }
        }
    }
    public void setResponseLiked(String likedOrNot, Person person)
    {
        Hobby personHobby = person.hobby();
        Major personMajor = person.major();
        Region personRegion = person.region();
        if (likedOrNot.equals("yes"))
        {
            switch (personHobby)
            {
                case music:
                    numLikedHobby[0] = numLikedHobby[0] + 1;
                case sport:
                    numLikedHobby[1] = numLikedHobby[1] + 1;
                case art:
                    numLikedHobby[2] = numLikedHobby[2] + 1;
                case read:
                    numLikedHobby[3] = numLikedHobby[3] + 1;
            }
            switch (personMajor)
            {
                case cs:
                    numLikedMajors[0] = numLikedMajors[0] + 1;
                case oe:
                    numLikedMajors[1] = numLikedMajors[1] + 1;
                case math:
                    numLikedMajors[2] = numLikedMajors[2] + 1;
                case cmda:
                    numLikedMajors[2] = numLikedMajors[2] + 1;
                default:
                    numLikedMajors[3] = numLikedMajors[3] + 1;
            }
            switch (personRegion)
            {
                case neus:
                    numLikedRegion[0] = numLikedRegion[0] + 1;
                case seus:
                    numLikedRegion[1] = numLikedRegion[1] + 1;
                case rus:
                    numLikedRegion[2] = numLikedRegion[2] + 1;
                case ous:
                    numLikedRegion[3] = numLikedRegion[3] + 1;
            }
        }
    }
    /**
     * 
     * @return
     */
    public int[] getNumHeardMajors()
    {
        return numHeardMajors;
    }
    /**
     * 
     * @return
     */
    public int[] getNumLikedMajors()
    {
        return numLikedMajors;
    }
    /**
     * 
     * @return
     */
    public int[] getNumHeardHobby()
    {
        return numHeardHobby;
    }
    /**
     * 
     * @return
     */
    public int[] getNumLikedHobby()
    {
        return numLikedHobby;
    }
    /**
     * 
     * @return
     */
    public int[] getNumHeardRegion()
    {
        return numHeardRegion;
    }
    /**
     * 
     * @return
     */
    public int[] getNumLikedRegion()
    {
        return numLikedRegion;
    }
}
