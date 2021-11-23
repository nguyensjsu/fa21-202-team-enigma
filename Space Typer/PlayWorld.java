import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayWorld extends World
{

    World playWorld;
    
    public PlayWorld(World world)
    {    
        super(600, 400, 1); 
        playWorld = world;
    }
    
    
    
      public void act()
    {    
       if(Greenfoot.mouseClicked(this)) Greenfoot.setWorld(playWorld);
    }
   
 
    
}

