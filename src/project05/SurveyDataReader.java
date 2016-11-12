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
        readSurveyFile(fileName);
    }
    
    /**
     * Read the data from the file
     * 
     * @param fileName the file name
     * @return A list of string[]
     */
    public LinkedList<Person> readSurveyFile(String fileName)
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
        
        return toPersonList(surveyData);
    }
    
    /**
     * Create a person list using survey data
     * 
     * @param the survey data
     */
    private LinkedList<Person> toPersonList(LinkedList<String[]> surveyData)
    {
        LinkedList<Person> personList = new LinkedList<Person>();
        
        int l = surveyData.getLength();
        
        for (int i = 2; i <= l; i++)
        {
            String[] info = surveyData.getEntry(i);
            if (info[2].equals("") || info[3].equals("") || info[4].equals(""))
            {
                continue;
            }
            personList.add(new Person(info));
            
        }
        
        return personList;
    }
}
