package firstExcercise;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println(sum);
		for(int i=1;i<=10;i++) {
		
			//System.out.println("The Value of i is "+i);
			//System.out.println("First Number is : "+firstNum);
			//System.out.println("Second Number is : "+secNum);
			//System.out.println("Sum Number is : "+sum);
			
			
			sum=firstNum+secNum;
			System.out.println(sum);
			//System.out.println("Sum is : "+sum);
			
			firstNum=secNum;
			//System.out.println("Revised First Number is : "+firstNum);
			secNum=sum;
			//System.out.println("Revised Second Number is : "+secNum);	
			sum=firstNum+secNum;
			//System.out.println("Revised Fibonacci Number is : "+sum);
			
		}
			
		
		
	}

}
