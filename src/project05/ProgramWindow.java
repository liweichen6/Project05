/**
 * Project 5
 */
package project05;

import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Program Window
 * 
 * @author Weichen Li (wli2)
 * @version 2016.11.05
 */
public class ProgramWindow {
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
    
    /**
     * 
     */
    public ProgramWindow() {
        this.window = new Window();
        window.setTitle("Project 5 - Group 5");
        
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
    }
    
    /**
     * Prev
     * @param button Prev
     */
    public void clickedPrev(Button button) {
        
    }
    
    /**
     * Next
     * @param button Next
     */
    public void clickedNext(Button button) {
        
    }
    
    /**
     * Artist
     * @param button Artist
     */
    public void clickedArtist(Button button) {
        
    }
    
    /**
     * Title
     * @param button Title
     */
    public void clickedTitle(Button button) {
        
    }
    
    /**
     * Date
     * @param button Date
     */
    public void clickedDate(Button button) {
        
    }
    
    /**
     * Genre
     * @param button Genre
     */
    public void clickedGenre(Button button) {
        
    }
    
    /**
     * Hobby
     * @param button Hobby
     */
    public void clickedHobby(Button button) {
        
    }
    
    /**
     * Major
     * @param button Major
     */
    public void clickedMajor(Button button) {
        
    }
    
    /**
     * Region
     * @param button Region
     */
    public void clickedRegion(Button button) {
        
    }
    
    /**
     * Quit
     * @param button Quit
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }
}
