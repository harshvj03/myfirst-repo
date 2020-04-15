package bucky;
import java.util.Scanner;


class A{
	private double firstno;
	private double secondno;
	
	void set_first(double i) {
		firstno = i;
	}
	
	double get_first(){
		return firstno;
	}
	
	int exit() {
		return 0;
	}
	
	void set_second(double j) {
		secondno = j;
	}
	
	double get_second(){
		return secondno;
	}
	
	double add()
	{
		return firstno + secondno;
	}
	
	double mult()
	{
		return firstno * secondno;
	}
	
	double sub()
	{
		return firstno - secondno;
	}
	
	double div()
	{
		if (secondno == 0)
		{
			return 0;
		}
		else
			return firstno/secondno;
	}
	

	
}

public class Calculator {
	public static void main(String args[]) {
	double a,b;
	//sc.close();
	
	
	while(true)
	{
		System.out.println("Hello, this is a Calculator");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mult");
		System.out.println("4.Div");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : "); 
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			A aa = new A();
			System.out.println("Enter first no. : ");
			a = sc.nextDouble();
			aa.set_first(a);
			System.out.println("Enter second no. : ");
			b = sc.nextDouble();
			aa.set_second(b);
			//sc.close();
			System.out.println(aa.add());
			//sc.close();
		}
		
		else if (choice == 2)
		{
			A aa = new A();
			System.out.println("Enter first no. : ");
			a = sc.nextDouble();
			aa.set_first(a);
			System.out.println("Enter second no. : ");
			b = sc.nextDouble();
			aa.set_second(b);
			//sc.close();
			System.out.println(aa.sub());
		}
		else if (choice == 3)
		{
			A aa = new A();
			System.out.println("Enter first no. : ");
			a = sc.nextDouble();
			aa.set_first(a);
			System.out.println("Enter second no. : ");
			b = sc.nextDouble();
			aa.set_second(b);
			//sc.close();
			System.out.println(aa.mult());
		}
		else if (choice == 4)
		{
			A aa = new A();
			System.out.println("Enter first no. : ");
			a = sc.nextDouble();
			aa.set_first(a);
			System.out.println("Enter second no. : ");
			b = sc.nextDouble();
			aa.set_second(b);
			//sc.close();
			System.out.println(aa.div());
		}
		else {
			A aa = new A();
			//sc.close();
			aa.exit();
			break;
		}
	}
	
	}
}
	

