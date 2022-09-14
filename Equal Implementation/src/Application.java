
public class Application {

	public static void main(String[] args) {
		Employee employee1=new Employee("001",123456,"Najath","960740052v","Ampara");
		Employee employee2=new Employee("002",234567,"Thanu","975456127v","Colombo");
		Employee employee3=new Employee("003",345678,"Nijath","705671235v","Colombo");
		
		System.out.println(employee1.equals(employee2));
		
		
		System.out.println("Employee 1 : "+employee1);
		System.out.println("Employee 2 : "+employee2);
		System.out.println("Employee 3 : "+employee3);
		
		
		System.out.println(employee1.equals(employee3));
		
		employee2.setEmpId("001");
		employee2.setEmpCode(123456);
		
	System.out.println(employee1.equals(employee2));
		
		
		System.out.println("Employee 1 : "+employee1);
		System.out.println("Employee 2 : "+employee2);
		System.out.println("Employee 3 : "+employee3);

		}

}
