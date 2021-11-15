import java.util.HashMap;
import greenfoot.*;
/**
 * Write a description of class MeteorDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MeteorDecorator extends Actor implements IMeteor {
    protected Obstacle obstacle;
    public MeteorDecorator(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
    //public abstract int multiplyScore(int score);
    @Override
    public void act() {
        this.obstacle.act();
    }

    @Override
    public void removeLabel() {
        this.obstacle.removeLabel();
    }

    @Override
    public String getValue() {
        return this.obstacle.getValue();
    }

    @Override
    public void explode() {
        this.obstacle.explode();
    }
}