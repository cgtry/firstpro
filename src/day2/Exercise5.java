package day2;

public class Exercise5 {

	public static void main(String[] args) {
		
		
	        int n = 21;
	        Exercise5 obj= new Exercise5();
	        int a=obj.calculateSum(n);
	        System.out.println(a);
	     
	    }
	static int calculateSum(int m)
    {
        int tot=0;
        for(int i=1;i<=m;++i) {
        	if((i%3==0)||(i%5==0)){
        		tot+=i;
        	}
        	
        }
         int z=0;
         for(int j=1;j<=m;++j) {
       	 if(m%(15)==0) z+=j;
      }
     
        return tot-z;
    }
	
	

}
