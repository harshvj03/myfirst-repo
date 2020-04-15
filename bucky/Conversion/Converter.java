package Conversion;

import java.util.Scanner;

class A{
	double kg,pound;
	
	A(){
		
	}
	A(double a,double b){
		kg = a;
		pound = b;
	}
	
	 static double Converttokg(double pound)
	{
		pound = pound * .4536;
		return pound;
	}
	 
	static double Converttopound(double kg) {
		kg = kg/.4536;
		return kg;
	}
}
public class Converter {
	public static void main(String args[]) {
		
		System.out.println("Enter a number in pound to convert in kg");
		Scanner sc = new Scanner(System.in);
		A a = new A();
		a.pound = sc.nextDouble();
		a.kg = A.Converttokg(a.pound);
		
		System.out.println("The conversion from "+ a.pound + " in kg : "+ a.kg);
		
		A aa = new A(100,100);
		
		System.out.println(aa.kg + "\n" + aa.pound);
		
		System.out.println("Converted value is : " + A.Converttopound(aa.kg) + "\n"+ A.Converttokg(aa.pound));
		
		
		
	
		
	}
}
