import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Comparator;
import java.util.Collections;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;


public class DiceGame {
	
	public static void main(String[] args) {
		/* Set up variables */
		Scanner scan = new Scanner(System.in);
		Random rng = new Random();
		
		final char[] defaultBoard = { 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o' };

		char[] board = defaultBoard.clone();
		int state = 0, die1 = 0, die2 = 0, xes = 0, round = 0;
		boolean quit = false;
		
		/* Test win *Definitely not cheating! */
		boolean isGoodRNG = false;
		int goodRNGi = 0;
		final int[] goodRNG = { 1, 2, 3, 4, 5, 6, 1, 6, 2, 6, 3, 6, 4, 6, 5, 6, 6, 6 };

		/* Game loop */
		do {
			/* Output */
			output(board, die1, die2, state, round, xes);
			
			/* Input */
			System.out.print("> ");
			String input = scan.next();
			
			switch (state) {
				case 0:	/* Main menu state */
					switch(input) {
						case "p": /* Play */
							if (isGoodRNG) {
								goodRNGi = 0;
								die1 = goodRNG[goodRNGi];
								goodRNGi++;
								die2 = goodRNG[goodRNGi];
								goodRNGi++;
							} else {
								die1 = rng.nextInt(1, 6);
								die2 = rng.nextInt(1, 6);
							}
							state = 1;
							break;
						case "b": /* Check score board */
							readScore();
							state = 0;
							break;
						case "e": /* Exit */
							quit = true;
							break;
						default: /* Exception */
							System.err.println(" Invalid input!");
					}
					break;
				case 1: /* Playing state */
					switch(input) {
						case "c": /* Combine */
							if (board[die1 + die2 -1] != 'x') {
								board[die1 + die2 -1] = 'x';
								
								xes += 1;
								if (xes == 12) {
									state = 2;
								}
								round += 1;
								
								if (isGoodRNG && goodRNGi < goodRNG.length -1) {
									die1 = goodRNG[goodRNGi];
									goodRNGi++;
									die2 = goodRNG[goodRNGi];
									goodRNGi++;
								} else {
									die1 = rng.nextInt(1, 6);
									die2 = rng.nextInt(1, 6);
								}
							} else {
								System.err.println(" Move invalid, pick another move");
							}
							break;
						case "s": /* Split */
							if (board[die1 -1] != 'x' && board[die2 -1] != 'x') {
								board[die1 -1] = 'x';
								board[die2 -1] = 'x';
								
								xes += 2;
								if (xes == 12) {
									state = 2;
								}
								round += 1;
								
								if (isGoodRNG && goodRNGi < goodRNG.length -1) {
									die1 = goodRNG[goodRNGi];
									goodRNGi++;
									die2 = goodRNG[goodRNGi];
									goodRNGi++;
								} else {
									die1 = rng.nextInt(1, 6);
									die2 = rng.nextInt(1, 6);
								}
							} else {
								System.err.println(" Move invalid, pick another move");
							}
							break;
						case "g": /* Give up */
							board = defaultBoard.clone();
							state = 3;
							break;
						default:
							System.err.println(" Invalid input!");
					}
					break;
				case 2: /* Win state */
					while (input.length() != 3 && !(input.equals("q"))) {
						System.err.println(" Please enter a 3 character name");
						System.out.print("> ");
						input = scan.next();
					}
					if (!(input.equals("q"))) {
						writeScore(input, (int)((xes / (round +1.0)) *xes *10));
					}
					board = defaultBoard.clone();
					state = xes = round = 0;
					break;
				case 3: /* Lose state */
					while (input.length() != 3 && !(input.equals("q"))) {
						System.err.println(" Please enter a 3 character name");
						System.out.print("> ");
						input = scan.next();
					}
					if (!(input.equals("q"))) {
						writeScore(input, (int)((xes / (round +1.0)) *xes *10));
					}
					board = defaultBoard.clone();
					state = xes = round = 0;
					break;
				default: /* Exception */
					System.err.println(" Invalid state?");
			}
		} while (!quit);
		
		System.out.println("\n Thank you for playing!");
		scan.close();
	}

	private static void output(char[] board, int die1, int die2, int state, int round, int xes) {
		/* Setup */
		String boardString = " ";
		for (char piece : board) {
			boardString += " " + piece + " ";
		}

		/* Strings */
		String boardScreen = "                Board                \n" + 
							 " 01 02 03 04 05 06 07 08 09 10 11 12 \n" + 
							 boardString + "\n";

		String roll = " You rolled: " + die1 + " & " + die2 + "\n";

		String gameMenu = " What would you like to do?\n" + 
						  " [c] to combine\n" + 
						  " [s] to split\n" + 
						  " [g] to give up\n";

		String menu = "               Dice Game               \n" + 
					  " [p] to play\n" + 
					  " [b] to see score board\n" + 
					  " [e] to exit\n";
		
		String win = "                You Won!               \n" + 
					 " Score: " + (int)((xes / (round +1.0)) *xes *10) + "\n" +
					 " [---] type 3 char to record your score!\n" +
					 " [q] to quit without recording your score\n";
		
		String lose = "                You Lost!               \n" + 
				 	  " Score: " + (int)((xes / (round +1.0)) *xes *10) + "\n" +
				 	  " [---] type 3 char to record your score!\n" +
				 	  " [q] to quit without recording your score\n";
		
		/* Output */
		switch(state) {
			case 0: /* Main menu state */
				System.out.println(menu);
				break;
			case 1: /* Playing state */
				System.out.println("\n Round [" + round + "]\n" + boardScreen + roll + gameMenu);
				break;
			case 2: /* Win state */
				System.out.println(win);
				break;
			case 3: /* Lose state */
				System.out.println(lose);
				break;
			default: /* Exception */
				System.err.println(" Something went catastrophically wrong!!!");
		}
	}
	
	private static void writeScore(String newName, int newScore) {
		/* Setup */
		ArrayList<String> scores = new ArrayList<String>(25);
		
		/* Fetch old data */
		try {
			File scoreBoard = new File("./cs115/DiceGame/scoreBoard.txt");
		    Scanner reader = new Scanner(scoreBoard);
		    while(reader.hasNextLine()) {
		    	String score = reader.nextLine();
		    	scores.add(score);
		    }
		    reader.close();
		} catch (FileNotFoundException e) {
			System.err.println(" Something went wrong trying to get scoreBoard.");
			e.printStackTrace();
		}
		
		/* Add new score */
		scores.add(newName + "," + newScore);
		
		/* Sort */
		Collections.sort(scores, new scoreComparator());
		
		/* Write back */
		String writeback = "";
		for (String score : scores) {
			writeback += score + "\n";
		}
		try {
			FileWriter writer = new FileWriter("./cs115/DiceGame/scoreBoard.txt");
			writer.write(writeback);
			writer.close();
			System.out.println(" Score has been recorded!");
		} catch (IOException e) {
			System.err.println(" Something went wrong while recording your score!.");
			e.printStackTrace();
		}
	}
	
	private static void readScore() {
		/* Setup */
		DecimalFormat formatScore = new DecimalFormat("000");
		DecimalFormat format = new DecimalFormat("00");
		String output = "                Top 50               \n";
		
		/* Fetch top 50 */
		try {
			File scoreBoard = new File("./cs115/DiceGame/scoreBoard.txt");
		    Scanner reader = new Scanner(scoreBoard);
		    for (int i = 1; i <= 50; i++) {
		    	if (reader.hasNextLine()) {
		    		String score = reader.nextLine();
			        String[] parts = score.split(",");
			        output += " " + format.format(i) + ".    " + parts[0] + "               " + 
			        		  formatScore.format(Integer.parseInt(parts[1])) + "\n";
		    	} else {
		    		output += " " + format.format(i) + ".    ---               ---\n";
		    	}
		    }
		    reader.close();
		} catch (FileNotFoundException e) {
			System.err.println(" Something went wrong trying to get scoreBoard.");
			e.printStackTrace();
		}
		
		System.out.println(output);
	}
}

class scoreComparator implements Comparator<String> {
    @Override
    public int compare(String record1, String record2) {
        int score1 = Integer.parseInt(record1.split(",")[1]);
        int score2 = Integer.parseInt(record2.split(",")[1]);
        return Integer.compare(score2, score1);
    }
}
