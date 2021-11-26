import greenfoot.*;

/**
 * Write a description of class PauseReceiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseReceiver implements IReceiver
{
     GreenfootImage myImage ;

     public void doAction(){
         
         while(!Greenfoot.isKeyDown("0")){
            Greenfoot.delay(1);
        }
         
        
   }
  
}
