package day1;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println(" Choose from red, yellow and green");
		Scanner sc= new Scanner(System.in);
		String light = sc.nextLine();
		
		switch (light) {
		
		case "red":    System.out.println("STOP");
		               break;
		case "yellow": System.out.println("Ready");
					   break;
		case "green":  System.out.println("GO");
					   break;
		default: System.out.println("Invalid entry");
		sc.close();
		}
		

	}

}
