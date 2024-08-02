package demo;

public class Array {

	public static void main(String[] args) {
		int[] age= {1,2,3,4,56,89};
		System.out.println(age.length);
		System.out.println(age[0]);
		for(int i=1; i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		for(int a: age) {
			System.out.println("using for each loop" + a);
		}
		// find the sum and average of the given array
		
		int[] num= {1,2,6,2,9,8};
		int sum=0;
		for(int n:num) {
		sum=sum+n;
		}
		System.out.println("the sum of array element is = " + sum);
		int avg=sum/num.length;
		System.out.println("average of the array is = " +avg);
		
		
		
		
	}

}
