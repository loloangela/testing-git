import java.util.Random;
import java.io.PrintWriter;
import java.io.IOException;

/*
* Generates a nine digit number, consisting of numbers 1 - 9. 
* Each number can only appear once
*/
public class Gen9{
	public static void main(String[] args){
		// Used to denote whether a number has already been chosen.
		int[] x = {0, 0, 0,
				   0, 0, 0,
				   0, 0, 0};
		int numsGenerated = 0;
		String state = "";
		Random randy = new Random();
		boolean leave = false;
		int rand = 0;
		while(leave == false)
		{
			rand = randy.nextInt(9);
			if(x[rand] == 0){
				x[rand]++;
				state += rand;
				//System.out.println("CurState: " + state);
				numsGenerated++;
				if(numsGenerated >= 9)
					leave = true;
			}
		}


		try{
			System.out.println("The new state is: " + state);
			PrintWriter writer = new PrintWriter("NineDigitNum.txt", "UTF-8");
			writer.println(state);
			writer.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}