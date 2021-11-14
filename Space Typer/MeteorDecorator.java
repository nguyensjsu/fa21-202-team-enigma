import java.util.HashMap;

/**
 * Write a description of class MeteorDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MeteorDecorator extends Meteor {
    public MeteorDecorator(int min, int max) {
        super(min, max);
    }

    public abstract int multiplyScore(int score);
}