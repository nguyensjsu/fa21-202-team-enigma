import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends Actor
{
   public Pause() {
       
       GreenfootImage myImage = getImage();
       int myNewHeight =(int)myImage.getHeight()/4;
       int myNewWidth = (int)myImage.getWidth()/4;
       myImage.scale(myNewWidth,myNewHeight);
       
   }
   

public void act()
    {
        
      if (Greenfoot.mousePressed(this)) {
          
        //  World world = getWorld();
         // Greenfoot.setWorld(new MyWorld());
         
        Greenfoot.stop();
         
          
      }
         
    }
 }
 
 


