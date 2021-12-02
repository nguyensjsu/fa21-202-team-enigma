"The key to learning is feedback. It is nearly impossible to learn anything without it." - Steven D. Levitt

# Week 1

The team members connected for the first time. Each team member was exploring on the project topic to work on. We were juggling between creating a game or an application. But we had already learned to apply patterns in an application through starbucks so based on the teams feedback about it we decided to create a game. Everyone searched for different games in Unity, Greenfoot, Java and Javascript. We really liked a game in Javascript. But after getting the feedback from team on it, we decided that  Javascript is not the best choice to learn the pattern implementation. Therefore, we moved forward with a game developed in Greenfoot which the team members found pretty interesting. We decided to ask our friends which can be users of the game to have a constructive feedback on the game and the additional functionalities.

Now, we had to analayse the existing game and decide which team member should work on which modules. As I was promoting the value : Feedback, I decided to analyse the game, and came up with additional functionalities which could enhance the game and also provided feedback with the design patterns which can be implemented while adding those functionalities. After explaining around 7 functionalities to team members, based on the teams' and users' feedback we decided to implement 5 of them.

# Week 2

After dividing the modules, I was assigned the module to Decorate the Obstacle with a BoosterMeteor where the points of that Meteor is doubled upon typing the word which helps in increasing the score of the game. I further debugged the code this week and short listed teh files which would require changes and the new files which should be added. Files : MyWorld.java, Display.Java, Obstacle.java required the changes and IMeteor.java, Meteor.java, MeteorDecorator.java, BoosterMetoer.java were the files to be added.

Based on the team's feedback we had decided to make the appropriate use of Git. But I was unaware of all the functionalities. So, to contribute in a different branch and get it reviewed. I learnt Git as well. I created a separate branch for my feature - BoosterMeteor and started working on it.

# Week 3

This week, I finished my module and created a Pull Request to get the feedback on it from Shreyas. He was working on the module feature - Reverse Words where the Obstacle file was used. So, we discussed and decided the approach of implementing pattern where the patterns of both modules can be accomodated using IMeteor interface.

Shreyas reviewed the Pull Request and provided feedback where our features required modification in two more files, Shield.java and Planet.java. Previously a Obstacle class was used, where now the interface IMeteor datatype will be used so that all the Meteors will be cleared when they clash with Planet or Shield. 

I also tested the functionality with the latest integrated code. There was modification in setting the paintOrder of the actors in the MyWorld constructor. Added the BoosterMeteor.class in it.

Also, I reviewed the Pull Request of Shreyas and provided him feedback to give more meaningful names to the files, he had added. Based, on the feedback, he updated the changes and we integrated the PRs of me and Shreyas.

I reviewed the Pull Request of Sagar and his implementation didn't touch any common files with other team members and he was good to merge his feature branch.

# Week 4

I reviewed the Pull Request of and Arpitha, provided the feedback on the changes required and then merged their Pull Requests. Member-1 had put wrong commits on the main branch so, I fixed it with hard resetting the branch and in the meantime Member-2 had pulled the code from main so I helped him fix his branch as well. So, I spent a lot of time this week in maintaining the git hub repository and acting as an Github administrator as the teammates were new to Git. I helped Member-1 and Member-2 to setup Git CLI locally because they had been uploading code on the git website directly. Informed all team members to update main branch locally since I had reset the HEAD of main branch to a stable commit and be careful before they create pull request as well. But again, Member-3 used old main branch to create a pull request and instead of fixing the pull request, Member-3 merged it into the main branch which made all my efforts to fix the branch in vain. I had a backup of a stable main branch so I pushed that and everyone added their changes and I force pushed that branch to main again. I performed QA each time a Pull Request was created to make sure that the integrated changes are working fine. 

Apart from the Github, I was working on the documentation i.e. creating Demo Video and UML diagrams.
