package StringKeywords;

public class DiffKeywords {

	void method()
	{
	/*String S1 = "Tejal";
	String S2 = "Rahul";
	
	String S3 = S1.concat(S2);
	System.out.println(S3); */
		
 /*	String S1 ="Tej";
	String S2 ="Tej";
	String S3 = new String("Tej");
	
	System.out.println(S1.equals(S2));
	System.out.println(S1.equals(S3));
	
	System.out.println(S1==S3);
	System.out.println(S1==S2); */
		
		String S1 = "Test";
		String S2 = "Data";
		String S3 = "Pune" + "Mumbai";
		
		System.out.println(S1.concat(S2));//adds the s1 & s2
		System.out.println(S3);
	}
	
	void substring()
	{
	/*	String S1 = "This is Test Data";
		System.out.println(S1.substring(5)); //It will print text starting from 5th position.
		System.out.println(S1.substring(8, 12));// It will print data from 8th position to 10th position */
	}
	
	void mymethod()
	{
		/* String S1 = "test data";
		System.out.println(S1.charAt(3)); */ //it will show the character at that position
	}
	
	void rev()
	{
		String S="Test Data";
		char c;
		String reverse= " ";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			c=S.charAt(i);
			System.out.println(c);
			reverse = reverse+c;
		}
		System.out.println(reverse);
		}
	
	void indexoff()
	{
		String S="Test Data";
		System.out.println(S.indexOf("t")); // it will show the character position number or index of that particular char
		System.out.println(S.indexOf("ta"));
		System.out.println(S.indexOf("S"));
		System.out.println(S.replace("s", "E"));
	}
	
	void trim()
	{
		String S=" This is string data "; // Trim will remove the white spaces from start & end of the string
		System.out.println(S.length());
		S=S.trim();
		System.out.println(S.length());
	}
	
	public static void main(String[] args) {
		
		DiffKeywords obj= new DiffKeywords();
		//obj.method();
	    //obj.substring();
		//obj.mymethod();
		//obj.rev();
		obj.indexoff();
		//obj.trim();
	}
	
}
