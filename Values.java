package values;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Values {
	public static void main(String args[]) {
		//declare list and variables for loops
		List<Float> user_input = new ArrayList<Float>();
		int i = 0;
		int j = 0;
		
		//ask for user to input numbers
		do {
			//input
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter number: ");
			float user_num = userInput.nextFloat();
			//enter into list
			user_input.add(user_num);
			//increment loop variable 
			i++;
		}
		while (i<=4);
		
		//print list
		do {
			System.out.println(user_input.get(j));
			j++;
		}
		while (j<=4);
		
		//declare variables for finding outputs
		//determine size of list
		int size = user_input.size();
		float total = 0;
		int k = 0;
		
		//determine sum of user inputs
		do {
			//add sums together
			total = user_input.get(k) + total;
			k++;
		}
		//while total number of times run is less than the length of list
		while (k <= (size - 1));
		
		//find average
		float avg = total/size;
		
		//print total, avg, max, min	
		System.out.println("Total: " + total);
		System.out.println("Average: " + avg);
		System.out.println("Max: " + Collections.max(user_input));
		System.out.println("Min: " + Collections.min(user_input));
		
		//declare variables for finding interest
		float interest = 0;
		int m = 0;
		
		//calculate interest and print
		do {
			interest = user_input.get(m) * (float)0.2;
			System.out.println("Interest rate of " + user_input.get(m) + ": " + interest);
			m++;
		}
		while (m <= (size-1));
		
		//print interest of total
		interest = total * (float)0.2;
		System.out.println("Interest on total of " + total + ": " + interest);
	}
	

}
