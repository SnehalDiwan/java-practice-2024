package demo;

public class StringPractice {
	
	private String button;
	public static void main(String[] args) {
	
		String exp="hello";
		String exp2=exp;
		exp=exp.concat("world");
		System.out.println(exp2);
		System.out.println(exp);
	}

}
