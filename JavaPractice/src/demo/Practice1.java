package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice1 {
	
	public static void high() {
		System.out.println("high method");
	}
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		  try {  
	            
			  double myDouble=scan.nextDouble();
	            
	        }   
	        catch (InputMismatchException ex) {  
	            System.out.println(  
	                    ex);  
	            System.out.println("catch the error here");
	         }  
		System.out.println("Enter the int number here");
		int number=scan.nextInt();
		System.out.println("enter user input" + number);
		System.out.println("Enter the float number here");
		float myFloat=scan.nextFloat();
		System.out.println("enter float" + myFloat);
		
		double myDouble=scan.nextDouble();
		System.out.println(myDouble);
		scan.close();
		
		double numb=6, summ=0;
		for(int i=1; i<numb; i++) {
			if(numb>0) {
				summ=summ+i;
				continue;
			}
			System.out.println("sum is = " +i);
		}
		
		
	}
}
