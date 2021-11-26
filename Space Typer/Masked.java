/**
 * Write a description of class Masked here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masked implements ModeType {
    public void update(String word, MyWorld world)
    {
        //To mask the word entered by user
        String mask = "";
        for(int i=0; i<word.length(); i++)
        {
            mask+="*";
        }
        LabelT display = new LabelT(mask, 50);
        world.updateLabel(display, 400, 410);     
    }
}
