/**
 * Project 5
 */
package project05;

import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Program Window
 * 
 * @author Weichen Li (wli2)
 * @version 2016.11.05
 */
public class ProgramWindow
{
    private Window window;
    private Album album;
    
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
    
    private Shape upperLeft;
    private Shape upperMiddle;
    private Shape upperRight;
    private Shape left;
    private Shape middle;
    private Shape right;
    private Shape lowerLeft;
    private Shape lowerMiddle;
    private Shape lowerRight;
    private Shape sample;
    
    private TextShape sampleT;
    private TextShape sampleH;
    private TextShape sampleL;
    
    
    /**
     * 
     */
    public ProgramWindow(Album a) 
    {
        album = a;
        this.window = new Window();
        window.setTitle("Project 5 - Group 5");
        window.setSize(800, 600);
        int w = window.getWidth() / 4;
        int h = (window.getHeight() - 100) / 3;
        int w1 = w / 2 - 5 / 2;
        int h1 = 70 + 2 / 3 * h;
        
        clickedPrev = new Button("¡û Prev");
        clickedNext = new Button("¡ú Next");
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
        window.addButton(clickedArtist, WindowSide.NORTH);
        window.addButton(clickedTitle, WindowSide.NORTH);
        window.addButton(clickedDate, WindowSide.NORTH);
        window.addButton(clickedGenre, WindowSide.NORTH);
        window.addButton(clickedNext, WindowSide.NORTH);
        window.addButton(clickedHobby, WindowSide.SOUTH);
        window.addButton(clickedMajor, WindowSide.SOUTH);
        window.addButton(clickedRegion, WindowSide.SOUTH);
        window.addButton(clickedQuit, WindowSide.SOUTH);
        
        upperLeft = new Shape(w1, h1, 5, 40, Color.BLACK);
        upperMiddle = new Shape(w1 + w, h1, 5, 40, Color.BLACK);
        upperRight = new Shape(w1 + 2 * w, h1, 5, 40, Color.BLACK);
        left = new Shape(w1, h1 + h, 5, 40, Color.BLACK);
        middle = new Shape(w1 + w, h1 + h, 5, 40, Color.BLACK);
        right = new Shape(w1 + 2 * w, h1 + h, 5, 40, Color.BLACK);
        lowerLeft = new Shape(w1, h1 + 2 * h, 5, 40, Color.BLACK);
        lowerMiddle = new Shape(w1 + w, h1 + 2 * h, 5, 40, Color.BLACK);
        lowerRight = new Shape(w1 + 2 * w, h1 + 2 * h, 5, 40, Color.BLACK);
        sample = new Shape(w1 + 3 * w, h1 + 2 * h, 5, 40, Color.BLACK);
        
        
        
        window.addShape(upperLeft);
        window.addShape(upperMiddle);
        window.addShape(upperRight);
        window.addShape(left);
        window.addShape(middle);
        window.addShape(right);
        window.addShape(lowerLeft);
        window.addShape(lowerMiddle);
        window.addShape(lowerRight);
        window.addShape(sample);
    }
    
    /**
     * Prev
     * @param button Prev
     */
    public void clickedPrev(Button button) 
    {
        
    }
    
    /**
     * Next
     * @param button Next
     */
    public void clickedNext(Button button) 
    {
        
    }
    
    /**
     * Artist
     * @param button Artist
     */
    public void clickedArtist(Button button) 
    {
        
    }
    
    /**
     * Title
     * @param button Title
     */
    public void clickedTitle(Button button) 
    {
        
    }
    
    /**
     * Date
     * @param button Date
     */
    public void clickedDate(Button button) 
    {
        
    }
    
    /**
     * Genre
     * @param button Genre
     */
    public void clickedGenre(Button button) 
    {
        
    }
    
    /**
     * Hobby
     * @param button Hobby
     */
    public void clickedHobby(Button button) 
    {
        
    }
    
    /**
     * Major
     * @param button Major
     */
    public void clickedMajor(Button button) 
    {
        
    }
    
    /**
     * Region
     * @param button Region
     */
    public void clickedRegion(Button button) 
    {
        
    }
    
    /**
     * Quit
     * @param button Quit
     */
    public void clickedQuit(Button button) 
    {
        System.exit(0);
    }
}
