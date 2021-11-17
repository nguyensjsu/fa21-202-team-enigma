import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * It will constantly move to the left until it hits the Shield or the Planet.
 * 
 * @author (Ricky) 
 * @version (April 11, 2019)
 */
public class RedObstacle extends Meteor
{
    String originalWord;
    
    public RedObstacle(int min, int max) {
        super(min, max);
        originalWord = super.getValue();
        setValue(reverseWord(originalWord));
    }

    public void act()
    {
        super.act();
    }

    // Remove the label on top of this Obstacle
    public void removeLabel() {
        super.removeLabel();
    }

    // Returns the word that should be typed on this Obstacle
    public String getValue() {
        return originalWord;
    }

    // Initiate the explosion sequence
    public void explode() {
        super.explode();
    }
    
    // Returns the Original word that should be returned for this Obstacle
    public String getOriginalWord() {
        return originalWord;
    }
    
    public String reverseWord(String word){
        if(word == null)
            return "*****"; // Handles if there ever is an invalid word
        String rWord = new StringBuffer(word).reverse().toString();
        return rWord;
    }
}
