import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayPause extends Actor
{
   private boolean gameon = true;
   private ICmnd pausegame = new ConcreteCommand();
   private ICmnd playgame = new ConcreteCommand(); 
   GreenfootImage myImage ;

public PlayPause() {
       
       //command pattern implementation

       pausegame.setReceiver(new PauseReceiver());
       playgame.setReceiver(new PlayReceiver());
   } 
   
public void act()
    {
    
        if(Greenfoot.isKeyDown("1")){
            setImage(new GreenfootImage("play.png"));
            setLocation(270,455);
            pausegame.execute();    
             
        setImage(new GreenfootImage("pause.png"));
        setLocation(270,455);
        while(!Greenfoot.isKeyDown("0")){
            Greenfoot.delay(1);
        } 
        
        
    }
  }
}

 



