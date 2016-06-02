import java.util.Random;
import java.io.PrintWriter;
import java.io.IOException;

public class Gen9{
	public static void main(String[] args){
		int[] x = {0, 0, 0,
				   0, 0, 0,
				   0, 0, 0};
		int numsGenerated = 0;
		String state = "";
		Random randy = new Random();
		boolean leave = false;
		while(leave == false)
		{
			int rand = randy.nextInt(9);
			if(x[rand] > 0){
				rand = randy.nextInt(9);
			}
			else{
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