
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.name = "Sam";
		e1.companyName = "GM";
		e1.salary = 2000;
		e1.doInduction();
		e1.promote();
		e1.removeEmployee();
		
		System.out.println("***********************");
		
		Employee e2 = new Employee();
		e2.name = "Mary";
		e2.companyName = "GMM";
		e2.salary = 5000;
		e2.doInduction();
		e2.promote();
		e2.removeEmployee();
		
		e1.companyName = "Nokia";
		System.out.println(e1.companyName);
		System.out.println(e2.companyName);
		Employee.companyName = "abc";
		
		Employee.creditSalaryOnMonthEnd();
		
		
		
	}

}
