import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * It will constantly move to the left until it hits the Shield or the Planet.
 * 
 * @author (Ricky) 
 * @version (April 11, 2019)
 */
public class Obstacle2 extends Meteor
{
    String originalWord;
    public Obstacle2(int min, int max) {
        super(min, max);
        originalWord = value;
        value = new StringBuffer(originalWord).reverse().toString();
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

}
