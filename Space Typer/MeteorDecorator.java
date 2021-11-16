import java.util.HashMap;
import greenfoot.*;
/**
 * Write a description of class MeteorDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeteorDecorator extends Meteor {

    public MeteorDecorator(int min, int max) {
        super(min, max);
    }
    //public abstract int multiplyScore(int score);
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