
public class Employee {
	//GLOBAL VARIABLES
	public String name;
	public int salary;
	public static String companyName;
	
	public void doInduction(){
		System.out.println("Completed Induction for the Employee " + name);
	}
	
	public void removeEmployee(){
		System.out.println("Removed the employee " + name);
	}
	
	public void promote(){
		System.out.println("Employee is promoted " + name);
	}
	
	public static void creditSalaryOnMonthEnd(){
		System.out.println("Salary is credited");
	}

}
