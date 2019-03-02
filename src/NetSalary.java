import java.util.Scanner;

public class NetSalary {
	public double calculate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary");
		float basicsal=sc.nextFloat();
		double netsal=basicsal-(0.5*basicsal)+(0.25*basicsal)+(0.12*basicsal);
		System.out.println("net sal:"+netsal);
		return netsal;
	}

	public static void main(String[] args) {
		NetSalary netsal=new NetSalary();
		netsal.calculate();
	}

}
