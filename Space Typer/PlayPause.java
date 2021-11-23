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
       
       myImage = getImage();
       int myNewHeight =(int)myImage.getHeight()/13;
       int myNewWidth = (int)myImage.getWidth()/13;
       myImage.scale(myNewWidth,myNewHeight);
       setLocation(270,455);
       
       
       //command pattern implementation

       pausegame.setReceiver(new PauseReceiver());
       playgame.setReceiver(new PlayReceiver());
       

   } 
   
   

public void act()
    {
    // if(Greenfoot.isKeyDown("space")){
        // if(gameon == false){
            // gameon = true;
            // Greenfoot.start(); 
        // }
        // else{
            // gameon = false;
            // Greenfoot.stop();
        // }
    
        if(Greenfoot.isKeyDown("P")){
            setImage(new GreenfootImage("pause.png"));
            int myNewHeight =(int)myImage.getHeight()/15;
            int myNewWidth = (int)myImage.getWidth()/15;
            myImage.scale(myNewWidth,myNewHeight);
        while(!Greenfoot.isKeyDown("0")){
            Greenfoot.delay(1);
        }
        
    }
    else if(Greenfoot.isKeyDown("A")){
            setImage(new GreenfootImage("play.png"));
            int myNewHeight =(int)myImage.getHeight()/18;
            int myNewWidth = (int)myImage.getWidth()/18;
            myImage.scale(myNewWidth,myNewHeight);
        }
    
    
      /* if (Greenfoot.mousePressed(this)) {
          
        // // if (gameon){
            // gameon = !gameon;
            // // gameon = false; 
            
            // // while (!gameon){
                // // Greenfoot.delay(1);
                
                
            // // }

               
            
          // }
       
     
        // else  {
          // gameon = true;  
        }
            
       } */
         
    }
  }

 



