import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * It will constantly move to the left until it hits the Shield or the Planet.
 * 
 * @author (Ricky) 
 * @version (April 11, 2019)
 */
public class Obstacle1 extends Actor implements Obstacle
{   
    private int explosionProgress; 
    private boolean completed; 
    private boolean explode;
    private String value;
    private GreenfootImage[] explosions;
    private SimpleTimer delay;
    
    // Constructor (Makes sure the word length is between minimum and maximum for smoother difficulty curve)
    public Obstacle1(int min, int max) {
        explosionProgress = 0; // The image the current explosion effect is on
        completed = false; // Whether the Label on top of Obstacle has been declared
        explode = false; // To determine if the Obstacle should explode
        value = MyWorld.getWords().get(Greenfoot.getRandomNumber(MyWorld.getWords().size())); // The word it will display
        explosions = new GreenfootImage[5]; // Images of the explosion sequence
        delay = new SimpleTimer(); // A delay between each of the explosion animation
        
        while (value.length() > max || value.length() < min) { 
            value = MyWorld.getWords().get(Greenfoot.getRandomNumber(MyWorld.getWords().size()));
        }
        
        for (int i = 0; i < explosions.length; i++) {
            explosions[i] = new GreenfootImage("explosion" + (i + 1) + ".png");
        }
    }
    
    public void act() 
    {
        if (!explode) { 
            MyWorld world = (MyWorld) getWorld();  // Get world reference
    
            // Initialize the label and displaying it (One time only)
            Label label = new Label(value, 30);
            if (!completed) {
                world.addLabel(label, getX(), getY());
                completed = true;
            }
           
            // Updating location
            setLocation(getX() - 1, getY());
            world.updateLabel(label, getX() - 1, getY());
            
            // Triggers method in Shield class if touching it
            if (isTouching(Shield.class)) {
                world.getObjects(Shield.class).get(0).clearAllObstacles(world);    
            }
        }
        else {
            
            // Explosion sequence
            if (delay.millisElapsed() > 100) {
                this.setImage(explosions[explosionProgress]);
                explosionProgress++;
                delay.mark();
            } 
            
            if (explosionProgress == 5) {
                getWorld().removeObject(this);
            }
        }
    }  
    
    // Remove the label on top of this Obstacle
    public void removeLabel() {
        removeTouching(Label.class);
    }
    
    // Returns the word that should be typed on this Obstacle
    public String getValue() {
        return value;
    }
    
    // Initiate the explosion sequence
    public void explode() {
        explode = true;
    }
    
    public int getX(){
        return getX();
    }
    
    public int getY(){
        return getY();
    }
}
