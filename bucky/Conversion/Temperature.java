package Conversion;

import java.util.Scanner;

class AB{
	double temp;
	static double temperature(double a) {
		a = (9/5)*a + 32;
		return a;
	}
}


public class Temperature {
	public static void main(String args[]) {
		double result;
		System.out.println("Hello, this is a temperature Convertor");
		System.out.println("Enter tempertaure in C : ");
		Scanner sc = new Scanner(System.in);
		
		AB a = new AB();
		a.temp = sc.nextDouble();
		result = AB.temperature(a.temp);
		
		System.out.println("The conversion into F is : " + result);
		
	}
}
