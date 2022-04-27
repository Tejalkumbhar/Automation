package StaticVariable;

public class STvariable {
	
	static int i=10;
	int x = 20;
	
	int method1()
	{
		return x;
	}

	static int method2()
	{
		return i;
	}
	
	public static void main(String[] args) {
		STvariable obj =new STvariable();
		System.out.println(obj.method1());
		System.out.println(STvariable.method2());  //classname.method
		System.out.println(method2());  // only method name
	}
}
