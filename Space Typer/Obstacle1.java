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
    // Constructor (Makes sure the word length is between minimum and maximum for smoother difficulty curve)
    public Obstacle1(int min, int max) {
        super(min, max);
    }

}
