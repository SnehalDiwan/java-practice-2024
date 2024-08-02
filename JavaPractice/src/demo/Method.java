package demo;

public class Method {
	String name;
	int i;
	static int num;
	
	public static void hreat()
	{
		System.out.println("static method");
	}
	
	String language;
	
	public Method(String lang) {
		language=lang;
		System.out.println(language + "programing language");
	}
	
	private Method() {
		System.out.println("constructor called");
		i=700;
	}
	public static int getAge(int age) {
		return age;
	}
	
	public int getNum(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	
	private static int getmul(int x) {
		return x*x;
	}
	public static String func(int a) {
	

		return "return string from int method"+a;
	}
	
	public static String func (String str) {
		return str;
	}
	
	public String func(int a,String b) {
		System.out.println("diff parameters");
		return a+" "+b;
	}
	
//	public Method() {
//		System.out.println("this is constructor");
//		 name="programiz";
//	}


	public static void main(String[] args) {
		StringPractice st=new StringPractice ();
		
		num=100;
		System.out.println(Method.num);
		
		int n1=10;
		int n2=20;
		Method m = new Method("java");
		Method m2 = new Method("python");
		Method m3 = new Method("c#");
//		System.out.println(m.language);
		System.out.println("The name is " + m.i);
		System.out.println(func(12));
		System.out.println(func("snehal"));
        m.func( 12, "snehsal");
		for(int i=1;i<=5;i++) {
			int result=getmul(i);
			System.out.println("squre root of " + i + " is = "  + +result);
		}
		
		System.out.println("the sum of numbers is " + m.getNum(n1, n2));
		System.out.println(Method.getAge(12));

				String str="snehal";
				String str1="Snehal";
				System.out.println(str.concat(str1));
	}

}
