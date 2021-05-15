package day3;

public class MainApp2 {
	static int counter = 100;
	
	/**
	 * 1. Three Classes used here. MainApp and Student, Employee
	 * 2. Static method is creating, creating the object. 
	 */
	public static void main(String[] args) {
		// using constructor here.
		Student std = new Student();
		
		// using the dot operator data member
		System.out.println(std.id);
		System.out.println(std.name);
		
		// static member
		System.out.println(MainApp2.counter);
		System.out.println(Student.company);
		
		// using the dot operator member functions
		std.method1();
		std.method1(100);
		
		Student.method2();
		
		
		// Calling Parametrized Constructor
		Student std1 = new Student(100, "Abcd");
		System.out.println(std1.id);
		
		
		
		// Now working with Employee
		Employee emp = new Employee();
		System.out.println(emp);
	}

}