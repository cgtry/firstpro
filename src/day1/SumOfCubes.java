package day1;
import java.util.*;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=0;

	    
	    System.out.println("Enter a Number");
	    Scanner sc = new Scanner(System.in);
	    input= sc.nextInt();

	    
	    int number = input;
	    int sum=0;
	    while(number>0){
	    	int cube=0;
	        int t= number%10;
	        cube= t*t*t;
	        //System.out.println("Cube of "+t +" is "+(cube));
	        number = number/10;
	        sum+=cube;
	    }
	    System.out.println("the sum is "+(sum));
	    sc.close();
	}

}
