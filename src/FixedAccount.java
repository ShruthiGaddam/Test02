import java.util.Scanner;

public class FixedAccount{
	static Scanner sc=new Scanner(System.in);
	 static double rate;
	 static float time;
	public void calculateInterest(double r) {
		System.out.println("enter rate value and time value");
		rate=sc.nextDouble();
		time=sc.nextFloat();
		System.out.println("enter balance");
		int balance=sc.nextInt();
		double interest=balance+balance*rate*time;
		System.out.println("interest:"+interest);
	}
	class AccountInterest extends FixedAccount{
	public double calculateInterest(){
		int principle;
		//float time;
		//float rate;
		System.out.println("enter values");
		principle=sc.nextInt();
		//time=sc.nextFloat();
		//rate=sc.nextFloat();
		double interest=(principle*time*rate)/100;
		System.out.println("interest is:"+interest);
		return interest;
	}
	}

	public static void main(String[] args) {
		FixedAccount acc=new FixedAccount();
		//FixedAccount acc1=new AccountInterest();
		AccountInterest acc1=acc.new AccountInterest();
		acc.calculateInterest(rate);
		acc1.calculateInterest();
	}

}
