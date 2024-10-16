
import java.util.Scanner;
//Stave.java	
//Anay Goyal
//10/16/24


/// When you are done with the code, clean up any extra blank lines
import java.util.Scanner;

public class Stave 
{

private int roll1, roll2, roll3, roll4, score,runningScore;







	public Stave () 
	{  
		roll1 = -1;
		roll2 = -1;
		roll3 = -1;
		roll4 = -1;
		score = 0;
		runningScore = 0;
		


	} 
	
	public static void main (String [] args) // main is complete 
	{ 
		Stave st = new Stave (); 
		st.runGame();
		
	}
	
	public void runGame()
	{
		
		System.out.println("\n\n");
		System.out.printf("%7s%16s%8s\n", "","Welcome to Staves!", "");
		for (int i = 0; i < 3; i++)	// this is a loop that runs 3 times, so it calls
		{								// all three methods in order 3 times.
			playGame();
			scoreGame();
			updateScore();
		}
		System.out.println("\n\n\n");
	}
	
	public void playGame () 
	{
		int pause;
		Scanner in = new Scanner(System.in);
		System.out.print("To roll the Staves, press Enter.");
		in.nextLine();
		Roll rollem = new Roll();
		ShowStave show = new ShowStave();
		roll1 = rollem.rollStave(); 
		show.DisplayStave(roll1); 
		
		roll2 = rollem.rollStave(); 
		show.DisplayStave(roll2); 
		
		roll3 = rollem.rollStave(); 
		show.DisplayStave(roll3); 
		
		roll4 = rollem.rollStave(); 
		show.DisplayStave(roll4); 
		
	} 
	
/* This method is complete.  scoreGame() builds a String of all 4 rolls as characters, then looks at all 4 characters, counting how many '$' there are.  If four or no '$' score increases by 2.  If two '$' score increases by 1.*/
	public void scoreGame() 
	{	
		score=0; 
		String rolls = new String("");
		rolls = "" + (char)roll1 + (char)roll2 + (char)roll3 + (char)roll4; 
		int count = 0;
		for (int i = 0; i < 4; i++) 
		{  
			if (rolls.charAt(i) == '$')
				count++;

		} 
		
		if (count == 4 || count == 0) 
		{
			score+=2; 
		}
		else if (count == 2) 
		{
			score++; 
		}

	}
	
	public void updateScore () 
	{
		runningScore+=score;
		System.out.println("This round earned a score of : " + score);
		System.out.println("Your total score is " + runningScore);
		System.out.print("\n\n");
	} 

} // end class Stave
//Be sure other two classes are written as well (both are very short).
//Neither class uses “static” in their methods – leave it out.  :)
