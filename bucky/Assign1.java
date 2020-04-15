package bucky;

public class Assign1 {
	//static void vaTest(int v[]) {
	static void vaTest(int ...v ) {
		System.out.print("Number of args: " + v.length + " Content: " );
		
		if(v.length < 2)
		{
			System.out.println("Less than two argument");
		}
		else
		{
			for(int x : v)
				System.out.print(x + " ");
			System.out.println();

		}
				
	}
	
	public static void main(String args[]) {
		//int n1[] = {10};
		
		//int n2[] = {1,2};
		
		vaTest(10);
		vaTest(1,2,3);
	}

}
