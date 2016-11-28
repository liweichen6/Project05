package prj5;

import java.awt.Color;

import CS2114.*;

/**
 * The Glyph class for song
 * 
 * @author Mingchi Li
 * @version 11/23/2016
 */
public class GUISongGlyph 
{
    private Window window;
    private int x;
    private int y;
    private Shape bar;
    private int[] songInfo;
    
    private TextShape title;
    private TextShape artist;
    
    private Shape barGlyph1;
    private Shape barGlyph2;
    private Shape barGlyph3;
    private Shape barGlyph4;
    private Shape barGlyph5;
    private Shape barGlyph6;
    private Shape barGlyph7;
    private Shape barGlyph8;
    
    
    /**
     * Create a new song Glyph
     * 
     * @param position  the position on the window
     * @param w the window need to add the glyph
     * @param p the person property
     * @param s the song need to create
     */
    public GUISongGlyph(int position, Window w, PersonPropertyEnum p, Song s)
    {
        window = w;
        
        
        
        int w1 = window.getWidth() / 4 + 10;
        int h1 = (window.getHeight() - 100) / 3;
        int w2 = w1 / 2 - 5 / 2;
        int h2 = 70 + 2 / 3 * h1;  
        
        if (p == PersonPropertyEnum.HOBBY)
        {
            songInfo = s.getHobbyData();
        }
        else if (p == PersonPropertyEnum.MAJOR)
        {
            songInfo = s.getMajorData();
        }
        else if (p == PersonPropertyEnum.REGION)
        {
            songInfo = s.getRegionData();
        }
        
        switch (position)
        {
            case 1:
                y = h2;
                x = w2;
                break;
            case 2:
                y = h2;
                x = w2 + w1;
                break;
            case 3:
                y = h2;
                x = w2 + 2 * w1;
                break;
            case 4:
                y = h2 + h1 - 30;
                x = w2;
                break;
            case 5:
                y = h2 + h1 - 30;
                x = w2 + w1;
                break;
            case 6:
                y = h2 + h1 - 30;
                x = w2 + 2 * w1;
                break;
            case 7:
                y = h2 + 2 * h1 - 30;
                x = w2;
                break;
            case 8:
                y = h2 + 2 * h1 - 30;
                x = w2 + w1;
                break;
            default:
                y = h2 + 2 * h1 - 30;
                x = w2 + 2 * w1;
        }
        
        title = new TextShape(x, y, s.getTitle());
        artist = new TextShape(x, y, "by " + s.getArtist());
        
        bar = new Shape(x, y, 5, 40, Color.BLACK);
        
        barGlyph1 = new Shape(x - songInfo[0], y, songInfo[0], 10, Color.PINK);
        barGlyph2 = new Shape(x - songInfo[1], y + 10, songInfo[1], 10, Color.BLUE);
        barGlyph3 = new Shape(x - songInfo[2], y + 20, songInfo[2], 10, Color.YELLOW);
        barGlyph4 = new Shape(x - songInfo[3], y + 30, songInfo[3], 10, Color.GREEN);
        
        barGlyph5 = new Shape(x + 5, y, songInfo[4], 10, Color.PINK);
        barGlyph6 = new Shape(x + 5, y + 10, songInfo[5], 10, Color.BLUE);
        barGlyph7 = new Shape(x + 5, y + 20, songInfo[6], 10, Color.YELLOW);
        barGlyph8 = new Shape(x + 5, y + 30, songInfo[7], 10, Color.GREEN);
    }
    
    /**
     * Put the song Glyph to the window
     */
    public void set()
    {
        window.addShape(title);
        window.addShape(artist);
        title.setBackgroundColor(Color.WHITE);
        artist.setBackgroundColor(Color.WHITE);
        title.moveTo(x - title.getWidth() / 2, y - 40);
        artist.moveTo(x - artist.getWidth() / 2, y - 25);
        
        window.addShape(bar);
        window.addShape(barGlyph1);
        window.addShape(barGlyph2);
        window.addShape(barGlyph3);
        window.addShape(barGlyph4);
        window.addShape(barGlyph5);
        window.addShape(barGlyph6);
        window.addShape(barGlyph7);
        window.addShape(barGlyph8);
    }
}
