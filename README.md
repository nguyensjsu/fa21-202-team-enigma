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
### Arpitha Srinivas
