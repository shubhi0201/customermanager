package guessing;
import javax.swing.*;

 public class Guessing {
	 

	public static String determineGuess(int userAnswer, int computerNumber, int count) {
		if(userAnswer <= 0 || userAnswer > 100) {
			return"your guess  is invalid";
		}
		else if(userAnswer== computerNumber) {
			return"right answer!\n Total guesses is :"+count;
				}
		else if(userAnswer>computerNumber) {
			return"your guess is too high.....try again\n "+count;
		}
		else if (userAnswer<computerNumber) {
			return"your guess is too low.....try agin\n"+count;
		}
		else {
		return"your guess is incorrect \n try again"+count;
		}
	}
	
	public static void main(String[] arg) {
		 int computerNumber =(int)(Math.random()*100+1);
		 int userAnswer=0;
		 System.out.println("the correct guess no would be"+ computerNumber);
		 int count=1;
		 while (userAnswer!= computerNumber) {
			 String response = 	JOptionPane.showInputDialog(null,"enter a guess no between 1 to 100","guessinggame",3);
			 userAnswer = Integer.parseInt(response);
			 JOptionPane.showMessageDialog(null,""+ determineGuess(userAnswer, computerNumber , count));
			 count++;		
		 }
		 
	 }

	
}
	
