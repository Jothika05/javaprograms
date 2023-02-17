import java.util.*;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Nmber:");
       int n = sc.nextInt();
       int sum=0;
       
       while(n>0) {
    	   sum+=n%10;
    	   n=n/10;
       }
       System.out.println("Sum of Digits is: "+sum);
	}

}
