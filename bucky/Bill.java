package bucky;
import java.util.Scanner;

class GBill{
	double samosa = 10;
	double kachori = 10;
	double dosa = 10;
	
}


public class Bill {
	public static void main(String args[]) {
		String choice;
		boolean quit = false;
		String order = "";
		double sum = 0;
		System.out.println("Welcome to Bill : ");
		
		do {
			System.out.println("Please select from the menu : ");
			System.out.println("Enter your choice : ");
			System.out.println("1.Samosa");
			System.out.println("2.Kachri");
			System.out.println("3.Dosa");
			System.out.println("4.Generate Bill");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.next();
			
			switch(choice) {
				case "1":
			{
				System.out.println("Samosa selected");
				GBill g = new GBill();
				sum += g.samosa;
				order = order.concat("Samosa"+"\n");
				break;
			}
			
				case "2":
			{
				System.out.println("kachori selected");
				GBill g = new GBill();
				sum += g.kachori;
				order = order.concat("Kachori"+"\n");
				break;
			}
				case "3":
				{
					System.out.println("kachori selected");
					GBill g = new GBill();
					sum += g.dosa;
					order = order.concat("dosa"+"\n");
					break;
				}
				case "4":
				{
					System.out.println("Generate Bill");
					quit = true;
					break;
				}
				default:
				{
					System.out.println("Wrong input");
				}
			
		}
		
		
		}while(!quit);
		
		
		System.out.println("Your order :\n" + order);
		System.out.println("Your bill : "+ sum);
		
	}
}

