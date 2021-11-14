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
        GreenfootImage image = getImage();
        image.scale(100, 100);
    }

    @Override
    public int multiplyScore(int score) {
        return score*2;
    }


}
