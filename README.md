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
### Brinda Pujara
### Sagar Bharatkumar Raval
- Added a feature of masked words when player reaches at difficulty level 4. During that level, when a player enter alphabets they will be displayed as asterisks e.g. if a player has entered alphabet "action" then it will be displayed as "******" on screen. 
- Used factory pattern to implement this feature. Created two claases **Masked** and **Unmasked** to handle it and class TypeFactory and interface ModeType to apply the design pattern and functionality. Class **Typefactory** desides which type to be implemented whether Masked or Unmasked based on a boolean variable. Masked and Unmasked implemets **ModeType** interface.
### Sai Swarup Rath
### Arpitha Srinivas
