import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;

/**
 * The screen that shows up after gameover, and displays the user's score and a button to play the game again
 *
 * @author (Charlie) 
 * @date (April 11, 2019)
 */
public class EndScreen extends World
{
    // Constructor
    public EndScreen(int score)
    {    
        super(800, 500, 1);  
        setPaintOrder(TopPlayers.class,Again.class);
        //Flashlight flashlight = new Flashlight();
        //addObject(flashlight, 400, 250);
        TopPlayers button1 = new TopPlayers();
        addObject(button1, 400, 350);
        Again button = new Again();
        addObject(button, 400, 450);
        Label label = new Label("Final Score", 40);
        addObject(label, 400, 250);
        Label label2 = new Label(score, 50);
        addObject(label2, 400, 300);
        
        try
                   {      
                      FileWriter geek_file;
                      File file = new File("scores.txt");
                      if(!file.exists()){
                       file.createNewFile();
                          }
                       FileWriter fw =  new FileWriter(file, true);
                      
          
                       BufferedWriter geekwrite = new BufferedWriter(fw); 
                   
                        geekwrite.write(String.valueOf(score));
                       geekwrite.newLine();
                       geekwrite.close();
                   }
                   catch(IOException except)
                   {
                     except.printStackTrace();
                   }
   
      
    }
}
