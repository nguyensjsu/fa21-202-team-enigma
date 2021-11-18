import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
   public Play() {
       
       GreenfootImage myImage = getImage();
       int myNewHeight =(int)myImage.getHeight()/14;
       int myNewWidth = (int)myImage.getWidth()/14;
       myImage.scale(myNewWidth,myNewHeight);
       
   }
   

public void act()
    {
        
      if (Greenfoot.mousePressed(this)) {
          
        //  World world = getWorld();
         // Greenfoot.setWorld(new MyWorld());
           
         Greenfoot.start();
         
          
      }
         
    }
 }

