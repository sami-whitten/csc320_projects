package withholding;
import java.util.Scanner; 
import java.text.DecimalFormat;  

public class Tax {
	
	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	
	public static void main(String args[])
	{
		int x = 0;
		double Income;
		do {
			String newline = System.lineSeparator();
			double adjusted_income;
			Scanner userInput = new Scanner(System.in);
			System.out.print("Weekly income: $");
			Income = userInput.nextFloat();
			if (Income < 500) {
				adjusted_income = (Income * 0.10);
				System.out.print("Weekly withholding: $" + decfor.format(adjusted_income) + newline);
			}
			if ((Income >= 500) & (Income < 1500)) {
				adjusted_income = (Income * 0.15);
				System.out.print("Weekly withholding: $" + decfor.format(adjusted_income) + newline);
			}
			if ((Income >= 1500) & (Income < 2500)) {
				adjusted_income = (Income * 0.20);
				System.out.print("Weekly withholding: $" + decfor.format(adjusted_income) + newline);
			}
			if (Income >= 2500) {
				adjusted_income = (Income * 0.30);
				System.out.print("Weekly withholding: $" + decfor.format(adjusted_income) + newline);
			}
			Scanner userChoice = new Scanner(System.in);
			System.out.print("To Exit, enter 0" + newline + "To Continue, enter 1" + newline);
			x = userChoice.nextInt();
		}
		while (x != 0);
	}

}
