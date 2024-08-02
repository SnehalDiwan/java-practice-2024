package demo;

public class Abstract extends Demo {
	@Override
	void animal() {
		System.out.println("this is abstract animal method");
		
	}
	Abstract(){
		super();
		System.out.println("abstract constructor");
	}

	public static void main(String[] args) {
		Abstract a= new Abstract();
		a.animal();
		Demo.rabit();

	}

	

}
