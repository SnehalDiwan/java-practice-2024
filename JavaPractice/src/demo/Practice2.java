package demo;

public class Practice2 {

	public static void main(String[] args) {
		
		Practice1.high();
		int number=90;
		String result=( number>23) ? "pass" : "fail";
		System.out.println(result);
		
		for(int i=1; i<=100;i++) {
			if(i==6) {
				break;
			}
			System.out.print(i+",");
		}
		//display the sum of natural number
		int num=1000, sum=0;
		for(int i=0; i<=num;i++) {
			sum=sum+i;
			System.out.println(sum);

	}
		
//for each
		int[]marks= {1,2,34,4,4};
		int add=0;
		for (int mark : marks) {
			add=add+mark;
		
		}
		System.out.println("the sum of numbers is in marks array is = " + add);
		
		char [] vowels= {'a','e','i','o','u'};
		for(char i=0; i<vowels.length;i++) {
			System.out.println(vowels[i]);
		}
			
			for(char item:vowels) {
				System.out.println(item);
			}
			
			for(int i=1; i<=10;i++) {
				if(i>4 && i<9) {
					continue;
					
				}
				System.out.println(i);
			}
			
			double numb = 0, summ=0;
			for(int i=1; i<6; i++) {
			
				summ=summ+i;
				
			}
			System.out.println("sum is = " +summ);
}
}
