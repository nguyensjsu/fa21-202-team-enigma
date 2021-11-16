import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * It will constantly move to the left until it hits the Shield or the Planet.
 * 
 * @author (Ricky) 
 * @version (April 11, 2019)
 */
public class Obstacle1 extends Meteor
{

    public Obstacle1(int min, int max) {
        super(min, max);

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
        return super.getValue();
    }

    // Initiate the explosion sequence
    public void explode() {
        super.explode();
    }

}
