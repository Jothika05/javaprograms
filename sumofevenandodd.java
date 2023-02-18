import java.util.*;
public class sumofevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements");
       int n = sc.nextInt();
       int sum =0,sum1=0;
       for(int i=1;i<=n;i++) {
    	   if(i%2==0) {
    		   sum++;
    	   }
    	   else{
    		   sum1++;
    	   }
       }
       System.out.println("Even number are: "+ sum);
       System.out.println("odd number are: "+ sum1);
	}
}
/*
 output
Enter the number of elements
5
Even number are: 2
odd number are: 3

 */
