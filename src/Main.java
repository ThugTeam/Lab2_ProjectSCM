import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
			inputData();
	}
	public static void inputData() {
		Scanner in = new Scanner(System.in);
		int i=0;
		char a ='Y';
		Payroll[] pay = new Payroll[1000];
		while(a=='Y') {
		
		System.out.print("input your ID : ");
		String id = in.next();
		System.out.print("input your Name : ");
		String name = in.next();
		System.out.print("input your Salary : ");
		int salary = in.nextInt();
		
		pay[i] = new Payroll(id, name, salary);
		System.out.println(pay[i].toString());
			System.out.print("Do you want to continue [Y/N] : ");
				a =in.next().charAt(0);
				i++;	
		}
		int sale;
		String id;
		System.out.print("input ID : ");
		id =in.next();
		System.out.print("input Sales : ");
		sale =in.nextInt();
		inputSale(pay,id,sale);
	}
	public static void inputSale(Payroll[] pay,String id,int sale) {
		for(int i=0;i<=pay.length;i++) {
			if(id.equals(pay[i].id) == true) {
				pay[i].setSale(sale);
				pay[i].calculate(pay[i].salary,pay[i].sale);
				System.out.println(pay[i].toString());
				break;
			}
			else {
				System.out.println("No ID number :"+id);
			}
		}
	}
}
