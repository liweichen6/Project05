package prj5;

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
    
    private int[] totalHeardMajors;
    private int[] totalHeardHobby;
    private int[] totalHeardRegion;

    private int[] numLikedMajors;
    private int[] numLikedHobby;
    private int[] numLikedRegion;
    
    private int[] totalLikedMajors;
    private int[] totalLikedHobby;
    private int[] totalLikedRegion;

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
        
        totalHeardMajors = new int[4];
        totalHeardHobby = new int[4];
        totalHeardRegion = new int[4];
        
        

        numLikedMajors = new int[4];
        numLikedHobby = new int[4];
        numLikedRegion = new int[4];
        
        totalLikedMajors = new int[4];
        totalLikedHobby = new int[4];
        totalLikedRegion = new int[4];
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
     * Set the response for the song
     * 
     * @param heardOrNot string of hearOrNot
     * @param person the person object
     */
    public void setResponseHeard(String heardOrNot, Person person)
    {
        HobbyEnum personHobby = person.getHobby();
        MajorEnum personMajor = person.getMajor();
        RegionEnum personRegion = person.getRegion();

        if (!heardOrNot.equals(""))
        {
            switch (personHobby)
            {
                case READ:
                    totalHeardHobby[0]++;
                    break;
                case ART:
                    totalHeardHobby[1]++;
                    break;
                case SPORT:
                    totalHeardHobby[2]++;
                    break;
                default:
                    totalHeardHobby[3]++;
            }

            switch (personMajor)
            {
                case CS:
                    totalHeardMajors[0]++;
                    break;
                case OTHER_ENGE:
                    totalHeardMajors[1]++;
                    break;
                case MATH_OR_CDMA:
                    totalHeardMajors[2]++;
                    break;
                default:
                    totalHeardMajors[3]++;
            }

            switch (personRegion)
            {
                case NE_US:
                    totalHeardRegion[0]++;
                    break;
                case SE_US:
                    totalHeardRegion[1]++;
                    break;
                case R_US:
                    totalHeardRegion[2]++;
                    break;
                default:
                    totalHeardRegion[3]++;
            }
        }
        
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
                default:
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
                default:
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
                default:
                    numHeardRegion[3]++;
            }
        }
    }

    /**
     * Set the liked response for the song
     * 
     * @param likedOrNot a string
     * @param person a person object
     */
    public void setResponseLiked(String likedOrNot, Person person)
    {
        HobbyEnum personHobby = person.getHobby();
        MajorEnum personMajor = person.getMajor();
        RegionEnum personRegion = person.getRegion();

        if (!likedOrNot.equals(""))
        {
            switch (personHobby)
            {
                case READ:
                    totalLikedHobby[0]++;
                    break;
                case ART:
                    totalLikedHobby[1]++;
                    break;
                case SPORT:
                    totalLikedHobby[2]++;
                    break;
                default:
                    totalLikedHobby[3]++;
            }

            switch (personMajor)
            {
                case CS:
                    totalLikedMajors[0]++;
                    break;
                case OTHER_ENGE:
                    totalLikedMajors[1]++;
                    break;
                case MATH_OR_CDMA:
                    totalLikedMajors[2]++;
                    break;
                default:
                    totalLikedMajors[3]++;
            }

            switch (personRegion)
            {
                case NE_US:
                    totalLikedRegion[0]++;
                    break;
                case SE_US:
                    totalLikedRegion[1]++;
                    break;
                case R_US:
                    totalLikedRegion[2]++;
                    break;
                default:
                    totalLikedRegion[3]++;
            }
        }
        
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
                default:
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
                default:
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
                default:
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
     * Get the total number of the heard person by major
     * 
     * @return the total heard person by major
     */
    public int[] getTotalHeardMajor()
    {
        return this.totalHeardMajors;
    }
    
    /**
     * Get the total number of the heard person by hobby
     * 
     * @return the total heard person by hobby
     */
    public int[] getTotalHeardHobby()
    {
        return this.totalHeardHobby;
    }
    
    /**
     * Get the total number of the heard person by region
     * 
     * @return the total heard person by region
     */
    public int[] getTotalHeardRegion()
    {
        return this.totalHeardRegion;
    }
    
    /**
     * Get the total number of the liked person by major
     * 
     * @return the total heard person by major
     */
    public int[] getTotalLikedMajor()
    {
        return this.totalLikedMajors;
    }
    
    /**
     * Get the total number of the liked person by hobby
     * 
     * @return the total heard person by hobby
     */
    public int[] getTotalLikedHobby()
    {
        return this.totalLikedHobby;
    }
    
    /**
     * Get the total number of the liked person by region
     * 
     * @return the total heard person by region
     */
    public int[] getTotalLikedRegion()
    {
        return this.totalLikedRegion;
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
    
    /**
     * This will display
     * 
     * @param p the property of this person
     */
    public void display(PersonPropertyEnum p)
    {
        System.out.println("Song Title: " + title);
        System.out.println("Song Artist: " + artist);
        System.out.println("Song Genre: " + genre);
        System.out.println("Song Year: " + date);
        
        switch (p)
        {
            case HOBBY:
                this.displayHobby();
                break;
            case REGION:
                this.displayRegion();
                break;
            default:
                this.displayMajor();
        }
    }
    
    /**
     * Display the data by hobby
     */
    private void displayHobby()
    {
        System.out.println("Heard");
        int pRead = this.getPercentage(numHeardHobby[0], totalHeardHobby[0]);
        int pArt = this.getPercentage(numHeardHobby[1], totalHeardHobby[1]);
        int pSport = this.getPercentage(numHeardHobby[2], totalHeardHobby[2]);
        int pMusic = this.getPercentage(numHeardHobby[3], totalHeardHobby[3]);
        System.out.println("reading:" + pRead + " art:" +
                pArt + " sports:" + pSport + " music:" + pMusic);
        
        pRead = this.getPercentage(numLikedHobby[0], totalLikedHobby[0]);
        pArt = this.getPercentage(numLikedHobby[1], totalLikedHobby[1]);
        pSport = this.getPercentage(numLikedHobby[2], totalLikedHobby[2]);
        pMusic = this.getPercentage(numLikedHobby[3], totalLikedHobby[3]);
        System.out.println("Likes");
        System.out.println("reading:" + pRead + " art:" +
                pArt + " sports:" + pSport + " music:" + pMusic);
    }
    
    /**
     * Display the data by major
     */
    private void displayMajor()
    {
        System.out.println("Heard");
        int pCS = this.getPercentage(numHeardMajors[0], totalHeardMajors[0]);
        int pOE = this.getPercentage(numHeardMajors[1], totalHeardMajors[1]);
        int pMC = this.getPercentage(numHeardMajors[2], totalHeardMajors[2]);
        int pOther = this.getPercentage(numHeardMajors[3], totalHeardMajors[3]);
        System.out.println("CS:" + pCS + " OE:" +
                pOE + " MC:" + pMC + " other:" + pOther);
        
        System.out.println("Likes");
        pCS = this.getPercentage(numLikedMajors[0], totalLikedMajors[0]);
        pOE = this.getPercentage(numLikedMajors[1], totalLikedMajors[1]);
        pMC = this.getPercentage(numLikedMajors[2], totalLikedMajors[2]);
        pOther = this.getPercentage(numLikedMajors[3], totalLikedMajors[3]);
        System.out.println("CS:" + pCS + " OE:" +
                pOE + " MC:" + pMC + " other:" + pOther);
    }
    
    /**
     * Display the data by hobby
     */
    private void displayRegion()
    {
        System.out.println("Heard");
        int pRead = this.getPercentage(numHeardRegion[0], totalHeardRegion[0]);
        int pArt = this.getPercentage(numHeardRegion[1], totalHeardRegion[1]);
        int pSport = this.getPercentage(numHeardRegion[2], totalHeardRegion[2]);
        int pMusic = this.getPercentage(numHeardRegion[3], totalHeardRegion[3]);
        System.out.println("reading:" + pRead + " art:" +
                pArt + " sports:" + pSport + " music:" + pMusic);
        
        System.out.println("Likes");
        pRead = this.getPercentage(numLikedRegion[0], totalLikedRegion[0]);
        pArt = this.getPercentage(numLikedRegion[1], totalLikedRegion[1]);
        pSport = this.getPercentage(numLikedRegion[2], totalLikedRegion[2]);
        pMusic = this.getPercentage(numLikedRegion[3], totalLikedRegion[3]);
        System.out.println("NE_US:" + pRead + " SE_US:" +
                pArt + " REST_US:" + pSport + " OUT_US:" + pMusic);
    }
    
    /**
     * Display the data by hobby
     * 
     * @return the data of hobby
     */
    public int[] getHobbyData()
    {
        int pHRead = this.getPercentage(numHeardHobby[0], totalHeardHobby[0]);
        int pHArt = this.getPercentage(numHeardHobby[1], totalHeardHobby[1]);
        int pHSport = this.getPercentage(numHeardHobby[2], totalHeardHobby[2]);
        int pHMusic = this.getPercentage(numHeardHobby[3], totalHeardHobby[3]);
        
        int pLRead = this.getPercentage(numLikedHobby[0], totalLikedHobby[0]);
        int pLArt = this.getPercentage(numLikedHobby[1], totalLikedHobby[1]);
        int pLSport = this.getPercentage(numLikedHobby[2], totalLikedHobby[2]);
        int pLMusic = this.getPercentage(numLikedHobby[3], totalLikedHobby[3]);

        int[] returnArray = {pHRead, pHArt, pHSport, pHMusic,
                             pLRead, pLArt, pLSport, pLMusic};
        
        return returnArray;
    }
    
    /**
     * Display the data by major
     * 
     * @return the data of major
     */
    public int[] getMajorData()
    {
        int pHCS = this.getPercentage(numHeardMajors[0], totalHeardMajors[0]);
        int pHOE = this.getPercentage(numHeardMajors[1], totalHeardMajors[1]);
        int pHMC = this.getPercentage(numHeardMajors[2], totalHeardMajors[2]);
        int pHOther = this.getPercentage(numHeardMajors[3], 
                                         totalHeardMajors[3]);
        
        int pLCS = this.getPercentage(numLikedMajors[0], totalLikedMajors[0]);
        int pLOE = this.getPercentage(numLikedMajors[1], totalLikedMajors[1]);
        int pLMC = this.getPercentage(numLikedMajors[2], totalLikedMajors[2]);
        int pLOther = this.getPercentage(numLikedMajors[3], 
                                         totalLikedMajors[3]);

        int[] returnArray = {pHCS, pHOE, pHMC, pHOther,
                             pLCS, pLOE, pLMC, pLOther};
        
        return returnArray;
    }
    
    /**
     * Display the data by hobby
     * 
     * @return the data of region
     */
    public int[] getRegionData()
    {
        int pHRead = this.getPercentage(numHeardRegion[0], totalHeardRegion[0]);
        int pHArt = this.getPercentage(numHeardRegion[1], totalHeardRegion[1]);
        int pHSport = this.getPercentage(numHeardRegion[2], 
                                         totalHeardRegion[2]);
        int pHMusic = this.getPercentage(numHeardRegion[3], 
                                         totalHeardRegion[3]);
        
        int pLRead = this.getPercentage(numLikedRegion[0], totalLikedRegion[0]);
        int pLArt = this.getPercentage(numLikedRegion[1], totalLikedRegion[1]);
        int pLSport = this.getPercentage(numLikedRegion[2], 
                                         totalLikedRegion[2]);
        int pLMusic = this.getPercentage(numLikedRegion[3], 
                                         totalLikedRegion[3]);
        
        int[] returnArray = {pHRead, pHArt, pHSport, pHMusic,
                             pLRead, pLArt, pLSport, pLMusic};
        
        return returnArray;
    }
    
    /**
     * Get the percentage of two numbers
     * 
     * @param n1 first number
     * @param n2 second number
     */
    private int getPercentage(int n1, int n2)
    {
        double f1 = n1 * 1.0; 
        double f2 = n2 * 1.0; 
        
        int result = (int) (f1 / f2 * 100);
        return result;
    }
}
