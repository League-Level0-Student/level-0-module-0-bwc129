package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String askCode = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if (askCode.equals ("yes")) {
	String e = JOptionPane.showInputDialog("You will dominate!");
}	// 3. Otherwise, tell them to sign up for classes at The League.
else {
	String other = JOptionPane.showInputDialog("GET SOME HELP!");
}
	
	}


}