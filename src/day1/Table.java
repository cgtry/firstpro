package day1;

public class Table {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=10;++i) {
			System.out.println(""+ n + "*"+ i +"="+ n*i);
		}
		
		int j=1;
		while(j<=10) {
			System.out.println(""+ n + "*"+ j +"="+ n*j);
			++j;
		}
	}

}
