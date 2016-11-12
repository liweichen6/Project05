package project05;
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
    private Hobby hobby;
    private Major major;
    private Region region;
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
        switch (h)
        {
            case "music":
                hobby = Hobby.MUSIC;
                break;
            case "sports":
                hobby = Hobby.SPORT;
                break;
            case "art":
                hobby = Hobby.ART;
                break;
            case "reading":
                hobby = Hobby.READ;
        }
    }
    
    /**
     * This method can set the region of this person
     * 
     * @param h region of this person
     */
    private void setRegion(String r)
    {
        switch (r)
        {
            case "Southeast":
                region = Region.SE_US;
                break;
            case "Northeast":
                region = Region.NE_US;
                break;
            case "United States (other than Southeast or Northwest)":
                region = Region.R_US;
                break;
            case "Outside of United States":
                region = Region.OUT_US;
        }
    }
    
    /**
     * This method can set the region of this person
     * 
     * @param h region of this person
     */
    private void setMajor(String m)
    {
        switch (m)
        {
            case "Computer Science":
                major = Major.CS;
                break;
            case "Math or CMDA":
                major = Major.MATH_OR_CDMA;
                break;
            case "Other Engineering":
                major = Major.OTHER_ENGE;
                break;
            case "Other":
                major = Major.OTHER;
        }
    }
    
    /**
     * Set the survey results for this person
     * 
     * @param the survey results
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
    public Hobby getHobby()
    {
        return hobby;
    }
    
    /**
     * Get the major of this person
     * 
     * @return the major
     */
    public Major getMajor()
    {
        return major;
    }
    
    /**
     * Get the region of this person
     * 
     * @return the region
     */
    public Region getRegion()
    {
        return region;
    }
}
