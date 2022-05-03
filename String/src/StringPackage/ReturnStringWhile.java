package StringPackage;

/*2. Write a program to reverse the given string using while loop.
String s = "Test Data" */


public class ReturnStringWhile {

	void String()
	{
		String S = " Test Data ";
		char c;
		String reverse="";
		
		int i = S.length()-1;
		while(i>=0)
		{
			c=S.charAt(i);
			reverse = reverse+c;
			i--;
		}
		
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		ReturnStringWhile obj= new ReturnStringWhile();
		obj.String();
	}
}
