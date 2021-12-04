# Space Typer (Team Enigma)

- The team decided to work on Game built on Greenfoot using Java.

## Team members
[Shreyas Kulkarni](https://github.com/Shreyaskulkarni98)<br>
[Brinda Pujara](https://github.com/brindap1210)<br>
[Sagar Bharatkumar Raval](https://github.com/SagarBharatkumarRaval)<br>
[Sai Swarup Rath](https://github.com/saiswaruprath)<br>
[Arpitha Srinivas](https://github.com/ArpithaSrinivas5)

## Source code
- We've used the existing code provided here: https://github.com/Ricky77768/ComputerScienceGames
- You can find information about permission and copyright in **LICENSE** folder included in given link. This game is open source and we decided to expand the original code.

## UI for Game<br>
### How To Play
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20-%20%20Instructions.png)
<br><br>
### Game UI
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20-%20Start%20Screen.png)
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20-%20Game%20Screen.png)
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20-%20Masked%20Words.png)
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20-%20Game%20Over.png)
<br><br>
### Scoreboard
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20-%20Scoreboard.png)

## Important Links
- [Video Ad](https://youtu.be/F3dqQNHN8MQ)
- [Video Demo](https://youtu.be/fAiq-afQVSU)
- [Shreyas's Journal](Journals/Shreyas_Kulkarni.md)
- [Brinda's Journal](Journals/Brinda_Pujara.md)
- [Sai's Journal](Journals/Sai_Swarup_Rath.md)
- [Sagar's Journal](Journals/Sagar_Raval.md)
- [Arpitha's Journal](Journals/Arpitha_Srinivas.md)

## Architecture and Model Diagrams
### Architecture Diagram
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Architecture%20and%20Models/Architecture%20diagram.png)
### Class Diagram
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Architecture%20and%20Models/Team%20Enigma%20Class%20Diagram.png)
### Deployment Diagram
![ALT Text](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Architecture%20and%20Models/Deployment%20Diagram.png)

## [Burndown Chart](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Reports/Team%20Enigma%20-%20Sprint%20Task%20Sheet.xlsx)
<img width="920" alt="BurnDownChart" src="https://user-images.githubusercontent.com/89321718/144522198-87b5e596-e644-40de-8b32-4ab7ef677c5d.png">

## Project Task Board
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20Scrum%20Task%20Board%20-%201.png)
![ALT TEXT](https://github.com/nguyensjsu/fa21-202-team-enigma/blob/brinda/latest-backup-11282021/Screenshots/Team%20Enigma%20Scrum%20Task%20Board%20-%202.png)

## Design Implementation Summary
### Shreyas Kulkarni
- This feature adds a little twist to the game - Red Meteor. This Red Meteor displays the word that needs to be entered in reverse order. So the gamer needs to quickly interpret and type the reverse.
- The design pattern used is 'Strategy Pattern'. Both the Grey Obstacle and Red Obstacle objects implement the Meteor interface. Whilst the value of the GreyObstacle is set as is, the RedObtacle is set to the reverse of the word. The checkWord() calls the getValue() function on Meteor interface to check if the word typed is consistent to the repective Grey or Red Obstacle object.
### Brinda Pujara
- Typing skills shoots the meteors, but the game doesn't have any feature which can boost your points. So, the Booster Meteor was added. When the Booster Meteor Decorator is shoot you will get double points, if you were to get 10 points for shooting the given word, it will add 20 points to your score. This way you can priortize the Booster Meteor to shoot to increase your points significantly.
- The design pattern implemeted here is 'Decorator Pattern'. **IMeteor** is the **interface** which has all the functionalities a Meteor will implement. Red and Grey Obstacles scores are calculated in a default manner. But to calculate scores of Booster Meteor I have decorated it with an additional functionality/method in the BoosterMeteor Class to double the points for shooting BoosterMeteor's word. Here, **MeteorDecorator** is the **abstract decorator class** and **BoosterMeteor** is the **class extending the abstract class**. Due to the limitations of Greenfoot, there were issues in setting the X and Y co-ordinates if the data from Grey Obstacle was directly used in BoosterMeteor as both are Actors. So, we created a Meteor class which fixed this problem.
### Sagar Bharatkumar Raval
- Added a feature of masked words when player reaches at difficulty level 4. During that level, when a player enters alphabets they will be displayed as asterisks e.g. if a player has entered a word "action" then it will be displayed as "******" on screen. 
- Used factory pattern to implement this feature. Created two claases **Masked** and **Unmasked** to handle it and class TypeFactory and interface ModeType to apply the design pattern and functionality. Class **Typefactory** desides which type to be implemented whether Masked or Unmasked based on a boolean variable. Masked and Unmasked implemets **ModeType** interface.
### Sai Swarup Rath
- Added a feature of displaying a scoreboard with top ten scores scored in the game which comes as an option when the game is over. When a player decides to check out the scoreboard, they just need to click on the scoreboard button and the top 10 scores in the game is displayed and the user can check if his score made it there.
- Used singleton design pattern for the implementation of this feature. Created a single class which tracks the score which gets incremented gradually as the game progresses and is stored in scoreboard object. When the time comes to display the scoreboard, we simply access this object and compare and display the final top ten scores that are stored for the game.
### Arpitha Srinivas

-  Implemented a play/pause button to play and pause the game at all levels. This feature is displayed once the user starts the game. 
-  This feature is implemented using the behavioral pattern- "command pattern". The button receives commands based on the key pressed by user during the game (keypress 1 for pause and 0 for play) and executes the doaction(). The Code for this feature can found in the following branch: https://github.com/nguyensjsu/fa21-202-team-enigma/tree/feature-pause-update
