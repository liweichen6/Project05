package prj5;

import CS2114.*;

/**
 * Program Window
 * 
 * @author Weichen Li (wli2)
 * @version 2016.11.05
 * 
 * @author Mingchi Li
 * @version 11/23/2016
 */
public class GUIProgramWindow
{
    private Window window;
    private Album album;
    private LinkedList<GUISongGlyph> songGlyphList;
    private GUILegendGlyph legendGlyph;
    private int page;
    private PersonPropertyEnum currentProperty;
    private boolean isOnclickRepresent = false;

    private Button clickedPrev;
    private Button clickedNext;
    private Button clickedArtist;
    private Button clickedTitle;
    private Button clickedDate;
    private Button clickedGenre;
    private Button clickedHobby;
    private Button clickedMajor;
    private Button clickedRegion;
    private Button clickedQuit;


    /**
     * 
     */
    public GUIProgramWindow(Album a) 
    {
        album = a;
        window = new Window();
        window.setTitle("Project 5 - Group 5");
        window.setSize(800, 600);
        page = 0;
        songGlyphList = new LinkedList<>();

        clickedPrev = new Button("Prev");
        clickedNext = new Button("Next");
        clickedArtist = new Button("Sort by Artist Name");
        clickedTitle = new Button("Sort by Song Title");
        clickedDate = new Button("Sort by Release Year");
        clickedGenre = new Button("Sort by Genre");
        clickedHobby = new Button("Represent Hobby");
        clickedMajor = new Button("Represent Major");
        clickedRegion = new Button("Represent Region");
        clickedQuit = new Button("Quit");

        clickedPrev.onClick(this, "clickedPrev");
        clickedNext.onClick(this, "clickedNext");
        clickedArtist.onClick(this, "clickedArtist");
        clickedTitle.onClick(this, "clickedTitle");
        clickedDate.onClick(this, "clickedDate");
        clickedGenre.onClick(this, "clickedGenre");
        clickedHobby.onClick(this, "clickedHobby");
        clickedMajor.onClick(this, "clickedMajor");
        clickedRegion.onClick(this, "clickedRegion");
        clickedQuit.onClick(this, "clickedQuit");

        window.addButton(clickedPrev, WindowSide.NORTH);
        clickedPrev.disable();
        window.addButton(clickedArtist, WindowSide.NORTH);
        window.addButton(clickedTitle, WindowSide.NORTH);
        window.addButton(clickedDate, WindowSide.NORTH);
        window.addButton(clickedGenre, WindowSide.NORTH);
        window.addButton(clickedNext, WindowSide.NORTH);
        window.addButton(clickedHobby, WindowSide.SOUTH);
        window.addButton(clickedMajor, WindowSide.SOUTH);
        window.addButton(clickedRegion, WindowSide.SOUTH);
        window.addButton(clickedQuit, WindowSide.SOUTH);  
    }

    /**
     * Create a list contain song glyphs
     */
    private void createSongGlyph()
    {
        int length = album.getAlbum().getLength();
        int position = 1;
        for (int i = 1; i <= length; i++)
        {
            Song currentSong = album.getAlbum().getEntry(i);
            songGlyphList.add(new GUISongGlyph(position, window, currentProperty , currentSong));
            if (position == 9)
            {
                position = 0;
            }
            position++;
        }
    }

    /**
     * Display the song Glyphs
     */
    private void displaySongGlyphs()
    {
        int num = page * 9 + 1;
        for (int i = num; i <= num + 8; i ++)
        {
            if (i > album.getAlbum().getLength())
            {
                break;
            }
            songGlyphList.getEntry(i).set();
        }
    }

    /**
     * Prev button
     * 
     * @param button Prev
     */
    public void clickedPrev(Button button) 
    {
        clickedNext.enable();
        page--;
        if (page <= 0)
        {
            clickedPrev.disable();
        }

        window.removeAllShapes();
        legendGlyph.set();
        displaySongGlyphs();
    }

    /**
     * Next button
     * 
     * @param button Next
     */
    public void clickedNext(Button button) 
    {
        if (isOnclickRepresent)
        {
            int maxPage = album.getAlbum().getLength() / 9;

            if (page == maxPage)
            {
                clickedNext.disable();
            }

            clickedPrev.enable();
            page++;

            window.removeAllShapes();
            legendGlyph.set();
            displaySongGlyphs();
        }
        else
        {
            window.addShape(new TextShape(250, 250, "Please select the property to display"));
        }

    }

    /**
     * Artist button
     * 
     * @param button Artist
     */
    public void clickedArtist(Button button) 
    {
        if (isOnclickRepresent)
        {
            window.removeAllShapes();
            page = 0;
            
            album.sort(SongPropertyEnum.ARTIST_NAME);
            songGlyphList.clear();
            createSongGlyph();
            displaySongGlyphs();
            legendGlyph.set();
        }
        else
        {
            window.addShape(new TextShape(250, 250, "Please select the property to display"));
        }
        
    }

    /**
     * Title button
     * 
     * @param button Title
     */
    public void clickedTitle(Button button) 
    {
        if (isOnclickRepresent)
        {
            window.removeAllShapes();
            page = 0;
            
            album.sort(SongPropertyEnum.SONG_TITLE);
            songGlyphList.clear();
            createSongGlyph();
            displaySongGlyphs();
            legendGlyph.set();
        }
        else
        {
            window.addShape(new TextShape(250, 250, "Please select the property to display"));
        }
    }

    /**
     * Sort by Date button
     * 
     * @param button Date
     */
    public void clickedDate(Button button) 
    {
        if (isOnclickRepresent)
        {
            window.removeAllShapes();
            page = 0;
            
            album.sort(SongPropertyEnum.DATE);
            songGlyphList.clear();
            createSongGlyph();
            displaySongGlyphs();
            legendGlyph.set();
        }
        else
        {
            window.addShape(new TextShape(250, 250, "Please select the property to display"));
        }
    }

    /**
     * Sort by Genre button
     * 
     * @param button Genre
     */
    public void clickedGenre(Button button) 
    {
        if (isOnclickRepresent)
        {
            window.removeAllShapes();
            page = 0;
            
            album.sort(SongPropertyEnum.GENRE);
            songGlyphList.clear();
            createSongGlyph();
            displaySongGlyphs();
            legendGlyph.set();
        }
        else
        {
            window.addShape(new TextShape(250, 250, "Please select the property to display"));
        }
    }

    /**
     * Represent Hobby button
     * 
     * @param button Hobby
     */
    public void clickedHobby(Button button) 
    {
        isOnclickRepresent = true;
        currentProperty = PersonPropertyEnum.HOBBY;
        window.removeAllShapes();

        legendGlyph = new GUILegendGlyph(window, currentProperty);
        legendGlyph.set();

        songGlyphList.clear();
        createSongGlyph();
        displaySongGlyphs();

    }

    /**
     * Represent Major button
     * 
     * @param button Major
     */
    public void clickedMajor(Button button) 
    {
        isOnclickRepresent = true;
        currentProperty = PersonPropertyEnum.MAJOR;
        window.removeAllShapes();

        legendGlyph = new GUILegendGlyph(window, currentProperty);
        legendGlyph.set();

        songGlyphList.clear();
        createSongGlyph();
        displaySongGlyphs();
    }

    /**
     * Represent Region button
     * 
     * @param button Region
     */
    public void clickedRegion(Button button) 
    {
        isOnclickRepresent = true;
        currentProperty = PersonPropertyEnum.REGION;
        window.removeAllShapes();

        legendGlyph = new GUILegendGlyph(window, currentProperty);
        legendGlyph.set();

        songGlyphList.clear();
        createSongGlyph();
        displaySongGlyphs();
    }

    /**
     * Quit button
     * 
     * @param button Quit
     */
    public void clickedQuit(Button button) 
    {
        System.exit(0);
    }

}
