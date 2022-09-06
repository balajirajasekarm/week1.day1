package firstExcercise;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 17;			
			
			for(int i = 2; i<number; i++) {
				
			if(number%i==0) 
			{			
				System.out.println("Number is not a Prime : "+number);
				break;
	}else 
		{
			System.out.println("Number is a Prime : "+number);
			break;
		}

	}
	
}
}
