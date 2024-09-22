package house;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


//program
public class main_house {
	public static void main(String[] args) {
		//declare variables and call main menu funciton
		int user_input = main_menu();	
		List<house> houses = new ArrayList<>();
		Scanner userInput = new Scanner(System.in);
		String newline = System.lineSeparator();
		
		do {
			//go through different functions depending on user selection from main menu
			switch (user_input) {
			//list houses
			case 1:
				//section header
				System.out.println("----------");
				System.out.println("Print House");
				System.out.println("----------");
				//print list of houses
				printList(houses);
				System.out.print(newline);
				System.out.println("Print? (y/n): ");
				String Q = userInput.nextLine();
				Q = Q.toLowerCase();
				if (Q.equals("y")) {
					try {
						//write info on each house to file
						FileWriter writer = new FileWriter("C:\\Users\\samij\\eclipse-workspace1\\CSC320_PortfolioProject\\houselist.txt");
						for(int i=0; i<houses.size();i++) {
							writer.write("House " + (i+1) + System.lineSeparator());
							writer.write("Address: " + houses.get(i).getAddress() + System.lineSeparator());
							writer.write("City: " + houses.get(i).getCity() + System.lineSeparator());
							writer.write("State: " + houses.get(i).getState() + System.lineSeparator());
							writer.write("Zip code: " + houses.get(i).getZip() + System.lineSeparator());
							writer.write("Square footage: " + houses.get(i).getSqft() + System.lineSeparator());
							writer.write("Sale status: " + houses.get(i).getSaleStatus() + System.lineSeparator());
							writer.write(" " + System.lineSeparator());
							
						}
						writer.close();
						System.out.println("Printed successfully!");
						}
						catch (IOException e) {
						System.out.println("Error!");
						e.printStackTrace();
					}
					
				}
				else {
					System.out.println("List will not be printed.");
				}
				break;
			//add house
			case 2:
				//declare variable for option to continue
				String O = "y";
				do {
					//section header
					System.out.println("---------");
					System.out.println("Add House");
					System.out.println("---------");
					//get house info from user
					house house1 = new house(getHouseInfo());
					//add house instance to list
					houses.add(house1);
					//print list
					printList(houses);
					System.out.print(newline);
					//give user option to add another house
					System.out.println("Would you like to add another house?(y/n) ");
					O = userInput.nextLine();
					//convert input to lowercase
					O = O.toLowerCase();
				}
				while (O.equals("y"));
				break;
			//delete house
			case 3:
				//declare variable for option to continue
				String X = "y";
				do {
					//section header
					System.out.println("------------");
					System.out.println("Delete house");
					System.out.println("------------");
					//print house list
					printList(houses);
					//ask user which house to remove based on number
					System.out.println("Enter number of the house you would like to remove: ");
					int i = userInput.nextInt();
					//adjust number to match list index
					i = i-1;
					//remove house at index
					houses.remove(i);
					//print list
					printList(houses);
					//consume empty line
					String z = userInput.nextLine();
					System.out.print(newline);
					//ask user if they want to remove another house
					System.out.println("Would you like to delete another house?(y/n) ");
					X = userInput.nextLine();
					//convert input to lowercase
					X = X.toLowerCase();
				}
				while (X.equals("y"));
				
				break;
			//update house
			case 4:
				//section header
				System.out.println("------------");
				System.out.println("Update house");
				System.out.println("------------");
				//print house list
				printList(houses);
				System.out.println("Which house would you like to update? ");
				int u = userInput.nextInt();
				u = u-1;
				updateHouse(houses.get(u));
				printList(houses);
				break;
			//exit
			case 0:
				//exit program
				System.out.println("Exiting...");
				System.exit(user_input);
			}
			//return to main menu
			user_input = main_menu();
		}
		while (user_input != 0);
		
	}

	//methods
	private static int main_menu() {
		//main menu offering different options
		//menu header
		System.out.println("*********************");
		System.out.println("------MAIN MENU------");
		System.out.println("*********************");
		//options
		System.out.println("[1] Print houses");
		System.out.println("[2] Add house");
		System.out.println("[3] Delete house");
		System.out.println("[4] Update house sale status");
		System.out.println("[0] Exit");
		System.out.println("---------------------");
		System.out.println(" ");
		//ask for user to input option
		Scanner userInput = new Scanner(System.in);
		System.out.println("What would you like to do? ");
		int user_input = userInput.nextInt();
		return user_input;
	}
	//list out houses
	private static void printList(List<house> houses) {
		try {
		int i = 0;
		do {
			//retrieve info from list and print
			System.out.println(" ");
			System.out.println("-------------");
			System.out.println("House " + (i+1));
			System.out.println("-------------");
			System.out.println("Address: " + houses.get(i).getAddress());
			System.out.println("City: " + houses.get(i).getCity());
			System.out.println("State: " + houses.get(i).getState());
			System.out.println("Zip code: " + houses.get(i).getZip());
			System.out.println("Square footage: " + houses.get(i).getSqft());
			System.out.println("Sale status: " + houses.get(i).getSaleStatus());
			System.out.println(" ");
			i++;
		}
		while (i < houses.size());
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
	
	//obtain house info
	public static house getHouseInfo() {
		//declare variables
		Scanner userInput = new Scanner(System.in);
		String address="";
		String city="";
		String state="";
		int zip_code=0;
		int sqft=0;
		String sale_status="";
		
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				//input address
				System.out.println("Enter address: ");
				address = userInput.nextLine();
				break;
			case 1:
				//input city
				System.out.println("Enter city: ");
				city = userInput.nextLine();
				break;
			case 2:
				//input state
				System.out.println("Enter state: ");
				state = userInput.nextLine();
				break;
			case 3:
				//input zip code
				System.out.println("Enter zip code: ");
				zip_code = userInput.nextInt();
				break;
			case 4:
				//input square footage
				System.out.println("Enter square footage: ");
				sqft = userInput.nextInt();
				//consume empty line
				String x = userInput.nextLine();
				break;
			case 5:
				//input sale status
				System.out.println("Enter sale status: ");
				sale_status = userInput.nextLine();
				break;
			}
		}
		System.out.println("House successfully added");
		//use info gathered to create new instance of house class
		house house1 = new house(address, city, state, zip_code, sqft, sale_status);
		return house1;
	}
	
	public static void updateHouse(house house1) {
		try {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Current sale status: " + house1.getSaleStatus());
		System.out.println("What is the new sale status?");
		String user_input = userInput.nextLine();
		house1.setSaleStatus(user_input);
		System.out.println("Updated successfully!");
		System.out.println("New sale status: " + house1.getSaleStatus());}
		catch(Exception e) {
			System.out.print("Something went wrong");
		}
	}
}
