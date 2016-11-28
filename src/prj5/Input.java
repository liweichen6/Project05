package prj5;

/**
 * Program Runner
 * 
 * @author Weichen Li (wli2)
 * @version 2016.11.05
 * 
 * @author Mingchi Li
 * @version 2016.11.6
 */
public class Input 
{
    
    public Input()
    {
        //Nothing
    }

    /**
     * The main method
     * 
     * @param args parameter
     */
    public static void main(String[] args)
    {
        String file1 = args[1];
        //String file1 = "SongList.csv";
        SongReader sr = new SongReader(file1);
        LinkedList<Song> songList = sr.readSongFile(file1);
        
        String file2 = args[0];
        //String file2 = "MusicSurveyData.csv";
        SurveyDataReader sdr = new SurveyDataReader(file2);
        LinkedList<Person> personList = sdr.readSurveyFile(file2);
        
        Album album = new Album(songList);
        album.setSongResponse(personList);
        
        
        album.sort(SongPropertyEnum.GENRE);
        album.display(PersonPropertyEnum.HOBBY);

        album.sort(SongPropertyEnum.SONG_TITLE);
        album.display(PersonPropertyEnum.HOBBY);
        
        GUIProgramWindow programWindow = new GUIProgramWindow(album);
    }
}
