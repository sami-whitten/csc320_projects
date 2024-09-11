package WeeklyTemps;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class WeeklyTemps {
	public static void main(String args[]) {
		//declare list and variables
		List<String> Temps = new ArrayList<>();
		int i = 0;
		String user_input = "";
		String newline = System.lineSeparator();
		String user_option = "y";
		
		//add temps to list
		Temps.add("MONDAY:" + newline + "High: 78 F" + newline + "Low:  55 F");
		Temps.add("TUESDAY:" + newline + "High: 84 F" + newline + "Low:  56 F");
		Temps.add("WEDNESDAY:" + newline + "High: 85 F" + newline + "Low:  61 F");
		Temps.add("THURSDAY:" + newline + "High: 82 F" + newline + "Low:  60 F");
		Temps.add("FRIDAY:" + newline + "High: 83 F" + newline + "Low:  61 F");
		Temps.add("SATURDAY:" + newline + "High: 81 F" + newline + "Low:  59 F");
		Temps.add("SUNDAY:" + newline + "High: 82 F" + newline + "Low:  57 F");
		
		
		//do-while loop allows user to rerun program until done
		do {
			//ask for user input for day/week
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter day of the week to see temperatures: ");
			user_input = userInput.next();
			//convert user input to lowercase chars
			user_input = user_input.toLowerCase();
			//determine which temps to output based on use input
			//then print corresponding list item by index
			switch (user_input) {
			case "monday":
				i = 0;
				System.out.println(Temps.get(i));
				break;
			case "tuesday":
				i = 1;
				System.out.println(Temps.get(i));
				break;
			case "wednesday":
				i = 2;
				System.out.println(Temps.get(i));
				break;
			case "thrusday":
				i = 3;
				System.out.println(Temps.get(i));
				break;
			case "friday":
				i = 4;
				System.out.println(Temps.get(i));
				break;
			case "saturday":
				i = 5;
				System.out.println(Temps.get(i));
				break;
			case "sunday":
				i = 6;
				System.out.println(Temps.get(i));
				break;
			case "week":
				System.out.println(user_input.toUpperCase());
				//loop through list to print all lines
				do {
					System.out.println(Temps.get(i));
					i++;
				}
				while (i < Temps.size());
				break;
			//input error check	
			default:
				System.out.println("Error");
			
			}
			//ask for user input to determine if continuing program or not
			Scanner userOption = new Scanner(System.in);
			System.out.print("Would you like to continue?(y/n): ");
			user_option = userOption.next();
			user_option = user_option.toLowerCase();
			
		}
		while (user_option.equals("y"));
	}

}
