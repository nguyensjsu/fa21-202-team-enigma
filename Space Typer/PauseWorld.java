import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseWorld extends World
{

    World pausedWorld;
    
    public PauseWorld(World world)
    {    
        super(600, 400, 1); 
        pausedWorld = world;
    }
    
    
    
      public void act()
    {    
       if(Greenfoot.mouseClicked(this)) Greenfoot.setWorld(pausedWorld);
    }
   
 
    
}

