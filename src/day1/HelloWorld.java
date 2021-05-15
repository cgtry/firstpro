package day1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		HelloWorld hw= new HelloWorld();
		hw.displayMessage("Hello Malaya");

	}
	
	public void displayMessage(String msg) {
		System.out.println(msg);
	}

}
