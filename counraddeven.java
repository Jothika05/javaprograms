import java.util.*;
public class counraddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the limit od Number : ");
       int n = sc.nextInt();
       int a,e=0,o=0;
       for(int i=0;i<=n;i++) {
    	   System.out.println("Enter the numbers : ");
    	   a=sc.nextInt();
    	   
    	   if(a%2==0) {
    		   e++;
    	   }
    	   else {
    		   o++;
    	   }
    		   
       }
       System.out.println("Odd number is " + o);
	   System.out.println("Even NUmber is " + e);
	}

}

		