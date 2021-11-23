/**
 * Write a description of class TypeFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TypeFactory {
    public ModeType getType(boolean isMask)
    {
        if(isMask)
        {
            return new Masked();
        }
        else
        {
            return new Unmasked();
        }
    }
}
