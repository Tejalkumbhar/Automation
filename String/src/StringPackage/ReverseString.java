package StringPackage;

/*1. Write a program to reverse the given string using for loop.
String s = "Test Data" */



public class ReverseString {

	void string()
	{
		String S=" Test Data ";
		char c;
		String reverse ="";
		
		for(int x = S.length()-1;x>=0;x--)
		{
		    c = S.charAt(x);
		//	System.out.println(c);
		    reverse = reverse + c;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.string();
	}
}
