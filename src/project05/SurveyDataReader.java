package project05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * read the survey data from the file
 * 
 * @author Mingchi Li
 * @version 11/5/2016
 */
public class SurveyDataReader 
{
    /**
     * create a new reader
     */
    public SurveyDataReader(String fileName)
    {
        readSureyFile(fileName);
    }
    
    /**
     * Read the data from the file
     * 
     * @param fileName the file name
     * @return A list of string[]
     */
    public LinkedList<String[]> readSureyFile(String fileName)
    {
        LinkedList<String[]> surveyData = new LinkedList<>();
        
        try
        {
            Scanner scanner = new Scanner(new File(fileName));
            
            while (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                String[] personData = str.split(",");
                surveyData.add(personData);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return surveyData;
    }
}
