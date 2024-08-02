package demo;

public class Child {
	
	private int age;
	
	public void setAge(int age) {
		this.age=age;
		System.out.println("the age is " + age);
	}
	
	public void head() {
	
		System.out.println("child head method");
	}


	public static void main(String[] args) {
		Child c = new Child();
		c.setAge(10);
		
		
		c.head();

	}

}
