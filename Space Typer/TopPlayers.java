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
     boolean mouseOver = false; // To determine if mouse is hovering over the button
 
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();  
         
        if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("TOP10.png");  
            mouseOver = true;  
        }  
        
        if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
        {  
            setImage("TOP10.png");  
            mouseOver = false;  
        } 
 
        if (Greenfoot.mouseClicked(this))  
        {    
            Greenfoot.setWorld(new AllScores());
           
        }   
    } 
}
