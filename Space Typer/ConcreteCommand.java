import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


//command pattern implimentation for play and pause button 

public class ConcreteCommand implements ICmnd
{
   private IReceiver theReceiver;
  
  public void execute(){
      
      theReceiver.doAction();
  }
  
  public void setReceiver(IReceiver target){
      theReceiver = target;
  }
  
  public void palyWorld () {
      
  }
  
}
