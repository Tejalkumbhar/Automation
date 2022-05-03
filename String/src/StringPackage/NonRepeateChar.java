package StringPackage;

/*3. Write a program to find out non repeating character in the given string.
String s = "Test Data" */


public class NonRepeateChar {
	
	String S=" Test Data ";
	
	void NonRepeat()
	{
		for(int i=0;i<=S.length()-1;i++)
		{
			int k=0;
			char C=S.charAt(i);
			for(int a=0;a<=S.length()-1;a++)
			{
				char D=S.charAt(a);
				if(C==D);
				{
					k++;
					
				}
			}
			if(k==1);
			{
				System.out.println(C);
			}
		}
	}

	public static void main(String[] args) {
		NonRepeateChar obj= new NonRepeateChar();
		obj.NonRepeat();
	}
}
