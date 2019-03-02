import java.util.Scanner;
public class LargestNumber {
		static int number;
		static int digit;
	public int get(int number, int digit)
		    {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		number=sc.nextInt();
		System.out.println("enter the digit ");
		 digit=sc.nextInt();
	
				char c = Integer.toString(digit).charAt(0);
		        for (int i = number; i > 0; --i)
		        {
		            if(Integer.toString(i).indexOf(c) == -1)
		            {
		                return i;
		            }
		        }
		        return -1;
		    }

			public static void main(String[] args) {
				LargestNumber large=new LargestNumber();	
				
				System.out.println("answer="+large.get(number, digit));
	}

}
