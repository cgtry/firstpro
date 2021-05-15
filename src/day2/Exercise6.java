package day2;

public class Exercise6 {

	public static void main(String[] args) {
		
		
		int n = 3;
		Exercise6 obj= new Exercise6();
		int b= obj.calculateDifference(n);
		System.out.println(b);
	}
	static int calculateDifference(int m) {
		int sum1=0;
		for(int i=1;i<=m;++i) {
			sum1=sum1 +(i*i);
		}
		int sum2=0;
		for(int j=1;j<=m;++j) {
			sum2+=j;
			}
		
		
		return  sum1-(sum2*sum2);
	}
}
