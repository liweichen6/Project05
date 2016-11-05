package project05;
/**
 * 
 * @author jacob
 *
 */
public class Person
{
    private Hobby hobby;
    private Major major;
    private Region region;
    private LinkedList<String> responses;
    /**
     * 
     */
    public Person(Hobby hobby, Major major, Region region, LinkedList<String> surveyResults)
    {
        this.hobby = hobby;
        this.major = major;
        this.region = region;
        responses = surveyResults;
    }
    /**
     * 
     */
    public LinkedList<String> getResponses()
    {
        return responses;
    }
    public Hobby hobby()
    {
        return hobby;
    }
    public Major major()
    {
        return major;
    }
    public Region region()
    {
        return region;
    }
}
