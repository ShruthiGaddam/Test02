import java.util.Scanner;
class InputValidException extends Exception {
	InputValidException(String msg){
		System.out.println(msg);
	}
}

public class EmployeeDetails {
	public void checkDetails() throws InputValidException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee details");
		String name=sc.next();
		int age,mobileno;
		mobileno=sc.nextInt();
		age=sc.nextInt();
		if(age<20 || age>55) {
			System.out.println("valid user");
		}
		else {
			throw new InputValidException("invalid user");
		}
	}

	public static void main(String[] args) throws InputValidException {
		EmployeeDetails emp=new EmployeeDetails();
		emp.checkDetails();

	}

}
