# ReUniProj

This repo will have all my remakes of my class projects from uni. Why am I remaking them? just for fun or for practice / review! 
The functions for the most part are the same, the remakes mainly just adds some polish now that there is no time constraint and stuff.
I'll still credit my partners if I had worked on the projects in a group, just seemed right to do so...

## Table of Contents

1. [cs115 | Object Oriented Programming I](#cs115--object-oriented-programming-i)
2. [cs116 | Object Oriented Programming II](#cs116--object-oriented-programming-ii) <custom java dataframe>
3. [cs331 | Data Structures and Algorithms]() <basic stack base python calc>
4. [cs422 | Data Mining]()

## cs115 | Object Oriented Programming I

### Dice Game

A java terminal game.
   
The first page the user sees is the main menu which looks like:
   
		               Dice Game               
		 [p] to play
		 [b] to see score board
		 [e] to exit

All the menus have a similar syntax. The charactor within the [ ] is what should be entered to pick that option.

The scoreboard shows the top 50 scores stored in the text file. 

		                Top 50               
		 01.    mee               101
		 02.    rfv               097
		 03.    ton               091
		 04.    ---               ---
		 05.    ---               ---
		  .      .                 .
		  .      .                 .
		  .      .                 .
   
User would need to navigate to the text file manually if they wish to see more then just the top 50 scores.

The UI for the actual game:

		 Round [1]
		                Board                
		 01 02 03 04 05 06 07 08 09 10 11 12 
		 o  o  o  x  x  o  o  o  o  o  o  o 
		 You rolled: 2 & 5
		 What would you like to do?
		 [c] to combine
		 [s] to split
		 [g] to give up

Two dice are rolled and user can choose:
- to 'split' to drop both numbers from the board: o -> x under that number.
- or 'combine' to drop the number equal to the sum of the 2 rolled numbers.
- or 'give up' which results in the lost screen.
                                           
This implementation does not force a lose screen, it will simply prompt the user to choose another option if the one they picked was invalid.

The lost screen:

		                  You Lost!               
		 Score: 20
		 [---] type 3 char to record your score!
		 [q] to quit without recording your score

User can give a three character name to be recorded in the score board or quit without recording their score.

The win screen is basically the same, other then that it only triggers when there are no 'o's on the board.

[Table of Contents](#table-of-contents)



