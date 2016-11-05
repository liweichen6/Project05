package project05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SurveyResults
{
    private LinkedList<Song> albumWithData;
    /**
     * 
     */
    public SurveyResults(LinkedList<Song> album, String fileName)
    {
        albumWithData = results(album, fileName);
    }
    /**
     * 
     */
    public LinkedList<Song> results(LinkedList<Song> album, String fileName)
    {
        LinkedList<Song> albumToReturn = album;
        try
        {
            Scanner file = new Scanner(new File(fileName));
            LinkedList<String> responses = new LinkedList<>();
            int index = 1;
            while (file.hasNextLine())
            {
                boolean isValid = true;
                Person personSurveyed;
                String majorString = null;
                String hobbyString = null;
                String regionString = null;
                Major major = null;
                Hobby hobby = null;
                Region region = null;
                Scanner nextLine = new Scanner(file.nextLine());
                if (nextLine.hasNextInt())
                {
                    responses = new LinkedList<>();
                }
                while (nextLine.hasNext() && isValid)
                {
                    String next = nextLine.next();
                    
                    if (next.charAt(0) != ',')
                    {
                        if (index == 1 && nextLine.hasNextInt())
                        {
                            next = nextLine.next();
                            next = nextLine.next();
                            next = nextLine.next();
                            while (next.charAt(0) != ',')
                            {
                                majorString = majorString + next;
                                next = nextLine.next();
                            }
                            while (next.charAt(0) != ',')
                            {
                                regionString = regionString + next;
                                next = nextLine.next();
                            }
                            while (next.charAt(0) != ',')
                            {
                                hobbyString = hobbyString + next;
                                next = nextLine.next();
                            }
                            if (hobbyString == null || majorString == null || 
                                regionString == null)
                            {
                                isValid = false;
                            }
                            else
                            {
                                
                            }
                            index = 2;
                            
                        }
                        else
                        {
                            
                        }
                    }
                }
                index = 1;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
        return albumToReturn;
    }
}
