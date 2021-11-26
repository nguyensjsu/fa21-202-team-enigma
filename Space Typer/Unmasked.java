/**
 * Write a description of class Unmasked here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unmasked implements ModeType {
    public void update(String word, MyWorld world)
    {
        LabelT display = new LabelT(word, 50);
        world.updateLabel(display, 400, 410);
    }
}
