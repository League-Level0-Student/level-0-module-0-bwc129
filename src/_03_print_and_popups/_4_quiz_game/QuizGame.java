package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score= 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String gh = JOptionPane.showInputDialog("What is 1+1?");
		
				// 3.  Use an if statement to check if their answer is correct
		if (gh.equals ("2")) {
			
				// 4.  if the user's answer was correct, add one to their score 
	score++;}
		else {
			score--;}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String hiff = JOptionPane.showInputDialog("What is 2+2?");
		if (hiff.equals ("4")) {
			score++;}
		else {
			score--;}
		String sd = JOptionPane.showInputDialog("What is 5+2?");
		if (sd.equals ("7")) {
			score++;}
		else {
			score--;}
		// After all the questions have been asked, tell the user their final score 
	
	JOptionPane.showMessageDialog(null,score);
	}
	
	
	
	}

