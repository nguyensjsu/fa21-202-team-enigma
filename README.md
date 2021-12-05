# Space Typer (Team Enigma)

- The team decided to work on Game built on Greenfoot using Java.

## Team members
Shreyas Kulkarni<br>
Brinda Pujara<br>
Sagar Bharatkumar Raval<br>
Sai Swarup Rath<br>
Arpitha Srinivas

## Source code
- We've used the existing code provided here: https://github.com/Ricky77768/ComputerScienceGames
- You can find information about permission and copyright in **LICENSE** folder included in given link. This game is open source and we decided to expand the original code.

## Design Implementation Summary
### Shreyas Kulkarni
- This feature adds a little twist to the game - Red Meteor. This Red Meteor displays the word that needs to be entered in reverse order. So the gamer needs to quickly interpret and type the reverse.
- The design pattern used is 'Strategy Pattern'. Both the Grey Obstacle and Red Obstacle objects implement the Meteor interface. Whilst the value of the GreyObstacle is set as is, the RedObtacle is set to the reverse of the word. The checkWord() calls the getValue() function on Meteor interface to check if the word typed is consistent to the repective Grey or Red Obstacle object.
### Brinda Pujara
### Sagar Bharatkumar Raval
- Added a feature of masked words when player reaches at difficulty level 4. During that level, when a player enter alphabets they will be displayed as asterisks e.g. if a player has entered alphabet "action" then it will be displayed as "******" on screen. 
- Used factory pattern to implement this feature. Created two claases **Masked** and **Unmasked** to handle it and class TypeFactory and interface ModeType to apply the design pattern and functionality. Class **Typefactory** desides which type to be implemented whether Masked or Unmasked based on a boolean variable. Masked and Unmasked implemets **ModeType** interface.
### Sai Swarup Rath
- Added a feature of displaying a scoreboard with top ten scores scored in the game which comes as an option when the game is over. When a player decides to check out the scoreboard, they just need to click on the scoreboard button and the top 10 scores in the game is displayed and the user can check if his score made it there.
-  Used singleton design pattern for the implementation of this feature. Created a single class which tracks the score which gets incremented gradually as the game progresses and is stored in scoreboard object. When the time comes to display the scoreboard, we simply access this object and compare and display the final top ten scores that are stored for the game.
### Arpitha Srinivas
-Implemented a play/pause button to play and pause the game at all levels. This feature is displayed once the user starts the game.
-This feature is implemented using the behavioral pattern- "command pattern". The button receives commands based on the key pressed by user during the game (keypress 1 for pause and 0 for play) and executes the doaction(). 

The Code for this feature can found in this branch: https://github.com/nguyensjsu/fa21-202-team-enigma/tree/feature-pause-update

Please find the below screenshots of the feature :
<img width="798" alt="pause" src="https://user-images.githubusercontent.com/89316938/144730356-12642d18-080a-4ec8-a35c-9c453962cf72.png">

<img width="800" alt="Greenfoot: Space Typer1" src="https://user-images.githubusercontent.com/89316938/144735802-0ee47baf-245c-4a7f-8aba-fca4f047d088.png">

<img width="799" alt="play" src="https://user-images.githubusercontent.com/89316938/144735805-753cac43-89ad-4d11-8306-dc41f9f8219f.png">
