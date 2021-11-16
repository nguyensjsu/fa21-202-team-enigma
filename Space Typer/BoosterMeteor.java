import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.HashMap;

/**
 * Write a description of class Booster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoosterMeteor extends MeteorDecorator
{
    
    // Constructor (Makes sure the word length is between minimum and maximum for smoother difficulty curve)
    public BoosterMeteor(int min, int max) {
        super(min, max);
        decorateImage();
    }

    private void decorateImage() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
    }
    
    public int multiplyScore(int score) {
        return score*2;
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
