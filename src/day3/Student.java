package day3;

public class Student {
	// data member
	public int id;  // 0
	public String name;  // null
	public static String company = "CAPGEMINI"; // null 
	
	// spciaal member::  constructor :: new keyword
	public Student(){
		System.out.println("I AM SUPER SPECIAL, I AM CALLED USING NEW KEYWORD!");
		
		// this keyword is used to access instance member
		// initialize instance member
		this.id = 500;
		this.name="Java";
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	// member function
	public void method1() {
		System.out.println("I am method1, with no param!");
	}
	public void method1(int n1) {
		System.out.println("I am method1, with one param!");
	}
	public void method1(int n1, int n2) {}
	
	
	public static void method2() {
		System.out.println("I AM STATIC FUNCTION");
	}
	public static void main() {}
}