package demo;

public abstract class Demo {
	abstract void animal();
	
	static void rabit() {
		System.out.println("this is rabit");
	}
	
	Demo(){
		System.out.println("parent constructor");
	}

	public static void main(String[] args) {
//		Demo d= new Demo();
		rabit();
//		d.animal();
		
	}

}
