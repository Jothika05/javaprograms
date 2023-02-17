import java.util.*;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the number");
          int n = sc.nextInt();
          int rev=0;
          
          while(n!=0) {
          int r = n%10;
        	rev = rev*10 +r;
        	  n=n/10;
          }
          System.out.println("Reverse a number is "+ rev);
     
         // */
          
        //2.String Buffer Class
          
        /* StringBuffer sb = new StringBuffer(String.valueOf(n));
          StringBuffer rev = sb.reverse();
          System.out.println("Reverse a number is "+ rev);
          */
          
          //3.StringBuilder
          
         // StringBuilder build = new StringBuilder();
         // build.append(n);
         // StringBuilder rev = build.reverse();
         // System.out.println("Reverse a number is "+ rev);
	}

          
}
