/**
 * Project 5
 */
package project05;

/**
 * Program Runner
 * 
 * @author Weichen Li (wli2)
 * @version 2016.11.05
 * 
 * @author Mingchi Li
 * @version 2016.11.6
 */
public class ProgramRunner {
    
    public ProgramRunner()
    {
        //Nothing
    }

    /**
     * The main method
     * 
     * @param args parameter
     */
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        String file1 = "SongList.csv";
        SongReader sr = new SongReader(file1);
        LinkedList<Song> songList = sr.readSongFile(file1);
        
        String file2 = "MusicSurveyData.csv";
        SurveyDataReader sdr = new SurveyDataReader(file2);
        LinkedList<Person> personList = sdr.readSurveyFile(file2);
        
        Album album = new Album(songList);
        album.setSongResponse(personList);
        
        ProgramWindow programWindow = new ProgramWindow(album);
    }
}
