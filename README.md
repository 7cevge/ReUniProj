# ReUniProj

This repository has a list of all the computer science courses I've taken in university.
In this repository are remakes of projects I've done for the courses or new projects that uses what was taught in that course.
The remakes are **NOT** the originals that I had submitted! All the code here are by me, from scratch with the originals as reference.
Why am I remaking them? just for fun or for practice / review! 
The main idea / functions for the most part are the same, the remakes may add some polish, extra features, etc. 
Some of them may actually be simpler then the original...
I'll still credit my partners from the original if I had worked on the projects in a group, just seemed right to do so...?

&nbsp;

## Table of Contents

1. [cs100 | Introduction to the Profession](#cs100--introduction-to-the-profession)
2. [cs115 | Object Oriented Programming I](#cs115--object-oriented-programming-i)
3. [cs116 | Object Oriented Programming II](#cs116--object-oriented-programming-ii)
4. [cs330 | Discrete Structures](#cs330--discrete-structures)
5. [cs331 | Data Structures and Algorithms](#cs331--data-structures-and-algorithms)
6. [cs350 | Computer Organization and Assembly Language Programming](#cs350--computer-organization-and-assembly-language-programming)
7. [cs351 | Systems Programming](#cs351--systems-programming)
8. [cs422 | Data Mining](#cs422--data-mining)
9. [cs425 | Database Organization](#cs425--database-organization)
10. [cs430 | Introduction to Algorithms](#cs430--introduction-to-algorithms)
11. [cs440 | Programming Languages and Translators](#cs440--programming-languages-and-translators)
12. [cs450 | Operating Systems](#cs450--operating-systems)
13. [cs451 | Introduction to Parallel and Distributed Computing](#cs451--introduction-to-parallel-and-distributed-computing)
14. [cs480 | Introduction to Artificial Intelligence](#cs480--introduction-to-artificial-intelligence)
15. [cs481 | Artificial Intelligence Language Understanding](#cs481--artificial-intelligence-language-understanding)
16. [cs485 | Computers and Society](#cs485--computers-and-society)
17. [cs487 | Software Engineering I](#cs487--software-engineering-i)
18. [cs512 | Computer Vision](#cs512--computer-vision)
19. [cs525 | Advanced Database Organization](#cs525--advanced-database-organization)
20. [cs535 | Design and Analysis of Algorithms](#cs535--design-and-analysis-of-algorithms)
21. [cs577 | Deep Learning](#cs577--deep-learning)
22. [cs584 | Machine Learning](#cs584--machine-learning)
23. [cs586 | Software Systems Architectures](#cs586--software-systems-architectures)
24. [cs587 | Software Project Management](#cs587--software-project-management)

&nbsp;

## cs100 | Introduction to the Profession

***College Finance Calculator***

About: The topic was a financial calculator to help with planning out debt and financial aid.
We didn't really write any code for it, mainly just google slides for the ui. Just learning about the work flow
of working in the tech industry, not really learning any programming.

Original Contributors: Alisha Khan, Alexander Garcia, Mehal Amitkumar Gosalia, Nhan Hoang, Thien Le, Hnin Nu Wai, and me
Language: ?

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs115 | Object Oriented Programming I

***Dice Game***

About: The real dice game where you roll 2 die and try to eliminate all the digits 1 to 10 but in a java terminal.
Learning and getting used to programming, starting with basic java.

Original Contributors: Aung Kham Naung and me

&nbsp;

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
		 03.    ---               ---
   
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
                                           
This implementation does **not force** a lost screen, it will simply prompt the user to choose another option if the one they picked was invalid.

The lost screen:

		                  You Lost!               
		 Score: 20
		 [---] type 3 char to record your score!
		 [q] to quit without recording your score

User can give a three character name to be recorded in the score board or quit without recording their score.

The win screen is basically the same, other then that it only triggers when there are no 'o's on the board.

[Table of Contents](#table-of-contents)

&nbsp;

## cs116 | Object Oriented Programming II

***Custom Data Frame***

About: Making our own custom java data frame and basic functions to go with it.
Learning more advanced tools in java like polymorphism or inheritance.

Original Contributors: Aung Khan Nham, Myat Minn Thiha, and me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs330 | Discrete Structures

***---***

About: There wasn't a project for this course.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs331 | Data Structures and Algorithms

***Basic Calculator***

About: There wasn't a project for this course, but the professor had suggested trying to 
make a simple stack based calculator in python.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs350 | Computer Organization and Assembly Language Programming

***---***

About: There wasn't a project for this course.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs351 | Systems Programming

***---***

About: There wasn't a project for this course.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs422 | Data Mining

***---***

About: There wasn't a project for this course, but I'd like to make something using the apiori tree and stuff using r.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs425 | Database Organization

***Mortgage Management***

About: Using SQL and java to make a mortgage management system. 
A database with the necessary information to help people find a loan or find people to loan to.

Original Contributors: Iqtedar Uddin, Muhammad Bilal Aijaz, and me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs430 | Introduction to Algorithms

***---***

About: There wasn't a project for this course.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs440 | Programming Languages and Translators

***---***

About: There wasn't a project for this course, but I'd like to make my own simple programming language using racket.

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs450 | Operating Systems

***Pintos Operating System***

About: Filling in the missing parts of the code to make the sudo operating system functioning. 
I'm not going to redo pintos, but maybe make a simple os similar to it?

Original Contributors: Alejandro Rivas, Gabriel Roskowski, Luis Manzo, Jamal Rafe Jowdeh, and me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs451 | Introduction to Parallel and Distributed Computing

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs480 | Introduction to Artificial Intelligence

***Intro AI***

About: There are 3 main projects: Tic Tac Toe AI, Sukoku AI, and a path finder.
Tic Tac Toe AI was one of the assigned projects from a previous semester, 
it wasn't one of the projects assigned to me when I took it but I'd like to still try it too.
These are all in python, so some of them can be slow.

Original Contributors: Just me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs481 | Artificial Intelligence Language Understanding

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs485 | Computers and Society

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs487 | Software Engineering I

***Whiteboard***

About: The original site / program my uni used for tracking grades and assignments was called blackboard.
We wanted to make our own version of that but with some changes. We only really made some ui, no real code.

Original Contributors: Aung Kham Naung, Kaung Myat Naing, Mazin Khider, and me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs512 | Computer Vision

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs525 | Advanced Database Organization

***Data Base Management System***

About: Creating our own data base management system in c.

Original Contributors: Hugo Bouy, Wenxuan Zhang, and me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs535 | Design and Analysis of Algorithms

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs577 | Deep Learning

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs584 | Machine Learning

***Custom Data Frame***

About: Making an algorithm that will help detect credit card fraud. 
Using supervised and unsupervised learning techniques such as Kernal regression, clustering, and Gaussian mixture model to train
the algorithm.

Original Contributors: Joseph Coco, and me

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs586 | Software Systems Architectures

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)

&nbsp;

## cs587 | Software Project Management

***---***

About: --- not yet taken

Original Contributors: ---

&nbsp;

...

[Table of Contents](#table-of-contents)