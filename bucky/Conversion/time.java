package Conversion;

import java.util.Scanner;

class B{
	double timeinsec;
	static String s = "";
	static String SecToHr(double a)
	{
		double hr,min,sec,temp1,temp2;
		
		hr = a%60;
		min = a/60;
		sec = min%60;
		min = min/60;
		
		return s;
		
		
	}
	
}

public class time {
	public static void main(String args[]) {
		String result;
		System.out.println("Enter time in seconds : ");
		Scanner sc = new Scanner(System.in);
		B b = new B();
		
		b.timeinsec = sc.nextDouble();
		result =  B.SecToHr(b.timeinsec);
		System.out.println("The time is : " + result);
	}
}
