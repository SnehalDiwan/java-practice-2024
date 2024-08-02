package demo;

public interface Language {
	
	public void source(int a,int b); 
		
	void getName(String name) ;
	
	void getAge(String str1,String str2);
	

}

class Display implements Language{

	@Override
	public void source(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void getName(String name) {
		System.out.println("programing language"+ name);
		
	}

	@Override
	public void getAge(String str1, String str2) {
		System.out.println(str1 + str2);
		
	}
	
}

class Main extends Display{
	
	public static void main(String[] args) {
		Display d= new Display();
		d.source(1, 7);
		d.getAge("jj","kk");
		d.getName("ikjuhgg");
	}
	
	
}