package bucky;

interface AB{
	void meth1();
	void meth2();
}

interface C extends AB{
	void meth3();
}


	

class IFExtend {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}

}

