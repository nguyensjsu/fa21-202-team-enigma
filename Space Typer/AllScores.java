import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class AllScores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllScores extends World implements IScoreTable
{
     private Scanner scorer = new Reader().getScanner("scores.txt"); // Scanner to read file
     public static ArrayList<Integer> topScores = new ArrayList<Integer>();
    /**
     * Constructor for objects of class AllScores.
     * 
     */
    public AllScores()
    {    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        setBackground(new GreenfootImage("background1.png"));
        String s = ScoreDisplay();
        Label label = new Label(s,40);
        addObject(label, 400, 250);
        topScores.clear();
        setPaintOrder(Again.class);
        Again button = new Again();
        addObject(button, 400, 550);
      
      
    }
    
  ////////new changes for displaying scores from file////////
    public String ScoreDisplay(){
       while (scorer.hasNext()) {
            String temp = scorer.nextLine().trim();
            topScores.add(Integer.parseInt(temp));
        }
         
        Collections.sort(topScores, Collections.reverseOrder());
            Iterator<Integer> it = topScores.iterator();
            int count= 0;
            StringBuilder sb = new StringBuilder();
            sb.append("Top 10 scores:");
            sb.append("\n");
             while(it.hasNext() && count < 10)
        {
            Integer value = it.next();
            count++;
            sb.append(value);
            sb.append("\n");
            
        }
        return sb.toString();
    }
 
}
     
    
  

