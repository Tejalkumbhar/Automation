package FinalThisStatic;

public class FinalKeyWord {

	final static int h=10;
	
	static void mymethod()
	{
		System.out.println(h);
	}
	
	final int a;
	FinalKeyWord()
	{
		a=50;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyWord obj = new FinalKeyWord();
		obj.mymethod();
		//mymethod();

	}

}
