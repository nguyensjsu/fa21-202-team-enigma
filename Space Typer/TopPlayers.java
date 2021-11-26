import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class TopPlayers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopPlayers extends Actor
{
    /**
     * Act - do whatever the TopPlayers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     boolean mouseOver = true; // To determine if mouse is hovering over the button
 
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();  
        setImage("scoreboard.jpeg");  
     
 
        if (Greenfoot.mouseClicked(this))  
        {    
            Greenfoot.setWorld(new AllScores());
           
        }   
    } 
}
