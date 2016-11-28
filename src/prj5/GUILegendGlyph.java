package prj5;

import java.awt.Color;

import CS2114.*;

/**
 * The glyph class for legend
 * 
 * @author Mingchi Li
 * @version 2016.11.28
 */
public class GUILegendGlyph 
{
    private Window window;
    private Shape legend;
    private Shape bar;
    private TextShape heard;
    private TextShape likes;
    private TextShape songTitle;
    private TextShape legendTitle;
    
    private TextShape text1;
    private TextShape text2;
    private TextShape text3;
    private TextShape text4;
    
    /**
     * Create a new legend
     * 
     * @param w the window need to add legend
     * @param p person property
     */
    public GUILegendGlyph(Window w, PersonPropertyEnum p)
    {
        window = w;
        legend = new Shape(610, 260, 140, 190, Color.BLACK);
        legend.setBackgroundColor(Color.WHITE);
        legend.setForegroundColor(Color.BLACK);
        songTitle = new TextShape(640, 370, "Song Title", Color.BLACK);
        heard = new TextShape(625, 410, "Heard", Color.BLACK);
        likes = new TextShape(685, 410, "Liked", Color.BLACK);
        bar = new Shape(675, 400, 5, 40, Color.BLACK);
        
        if (p == PersonPropertyEnum.HOBBY)
        {
            legendTitle = new TextShape(625, 270, "Hobby Legend", Color.BLACK);
            text1 = new TextShape(625, 300, "Read", Color.PINK);
            text2 = new TextShape(625, 315, "Art", Color.BLUE);
            text3 = new TextShape(625, 330, "Sports", Color.YELLOW);
            text4 = new TextShape(625, 345, "Music", Color.GREEN);
        }
        else if (p == PersonPropertyEnum.MAJOR)
        {
            legendTitle = new TextShape(625, 270, "Major Legend", Color.BLACK);
            text1 = new TextShape(625, 300, "Comp Sci", Color.PINK);
            text2 = new TextShape(625, 315, "Other Eng", Color.BLUE);
            text3 = new TextShape(625, 330, "Math/CDMA", Color.YELLOW);
            text4 = new TextShape(625, 345, "Other", Color.GREEN);
        }
        else
        {
            legendTitle = new TextShape(625, 270, "Region Legend", Color.BLACK);
            text1 = new TextShape(625, 300, "NE US", Color.PINK);
            text2 = new TextShape(625, 315, "SE US", Color.BLUE);
            text3 = new TextShape(625, 330, "The rest of US", Color.YELLOW);
            text4 = new TextShape(625, 345, "Outside the US", Color.GREEN);
        }
        
        heard.setBackgroundColor(Color.WHITE);
        likes.setBackgroundColor(Color.WHITE);
        songTitle.setBackgroundColor(Color.WHITE);
        legendTitle.setBackgroundColor(Color.WHITE);
        text1.setBackgroundColor(Color.WHITE);
        text2.setBackgroundColor(Color.WHITE);
        text3.setBackgroundColor(Color.WHITE);
        text4.setBackgroundColor(Color.WHITE);
    }
    
    /**
     * Put the legend on the window
     */
    public void set()
    {
        
        window.addShape(likes);
        window.addShape(heard);
        window.addShape(songTitle);
        window.addShape(text1);
        window.addShape(text2);
        window.addShape(text3);
        window.addShape(text4);
        window.addShape(legendTitle);
        window.addShape(bar);
        window.addShape(legend);
    }
}
