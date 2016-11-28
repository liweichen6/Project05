package prj5;
/**
 * The person class 
 * 
 * @author jacob
 * @version 11/5/2016
 * 
 * @author Mingchi Li
 * @version 11/6/2016
 */
public class Person
{
    private HobbyEnum hobby;
    private MajorEnum major;
    private RegionEnum region;
    private String[] responses;

    /**
     * Create a new person object
     * 
     * @param surveyResults survey results of this person
     */
    public Person(String[] surveyResults)
    {
        setMajor(surveyResults[2]);
        setRegion(surveyResults[3]);
        setHobby(surveyResults[4]);
        setResponses(surveyResults);
    }

    /**
     * This method can set the hobby of this person
     * 
     * @param h hobby of this person
     */
    private void setHobby(String h)
    {
        if (h.equals("music"))
        {
            hobby = HobbyEnum.MUSIC;
        }
        else if (h.equals("sports"))
        {
            hobby = HobbyEnum.SPORT;
        }
        else if (h.equals("art"))
        {
            hobby = HobbyEnum.ART;
        }
        else if (h.equals("reading"))
        {
            hobby = HobbyEnum.READ;
        }
    }

    /**
     * This method can set the region of this person
     * 
     * @param r region of this person
     */
    private void setRegion(String r)
    {
        if (r.equals("Southeast"))
        {
            region = RegionEnum.SE_US;
        }
        else if (r.equals("Northeast"))
        {
            region = RegionEnum.NE_US;
        }
        else if (r.equals("United States "
                + "(other than Southeast or Northwest)"))
        {
            region = RegionEnum.R_US;
        }
        else if (r.equals("Outside of United States"))
        {
            region = RegionEnum.OUT_US;
        }
    }

    /**
     * This method can set the region of this person
     * 
     * @param m region of this person
     */
    private void setMajor(String m)
    {
        if (m.equals("Computer Science"))
        {
            major = MajorEnum.CS;
        }
        else if (m.equals("Math or CMDA"))
        {
            major = MajorEnum.MATH_OR_CDMA;
        }
        else if (m.equals("Other Engineering"))
        {
            major = MajorEnum.OTHER_ENGE;
        }
        else if (m.equals("Other"))
        {
            major = MajorEnum.OTHER;
        }
    }

    /**
     * Set the survey results for this person
     * 
     * @param surveyResults the survey results
     */
    private void setResponses(String[] surveyResults)
    {
        int length = surveyResults.length - 5;
        String[] temp = new String[length];

        for (int i = 0; i < length; i++)
        {
            temp[i] = surveyResults[i + 5];
        }

        responses = temp;
    }

    /**
     * Get the responses of this person
     * 
     * @return the responses
     */
    public String[] getResponses()
    {
        return responses;
    }

    /**
     * Get the hobby of this person
     * 
     * @return the hobby
     */
    public HobbyEnum getHobby()
    {
        return hobby;
    }

    /**
     * Get the major of this person
     * 
     * @return the major
     */
    public MajorEnum getMajor()
    {
        return major;
    }

    /**
     * Get the region of this person
     * 
     * @return the region
     */
    public RegionEnum getRegion()
    {
        return region;
    }
}
