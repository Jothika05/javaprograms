import java.util.*;
public class positionofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Limits:");
       int n = sc.nextInt();
       int a[] = new int[n];
       System.out.println("Enter the Elements");
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
    	   
       }
       System.out.println("Your Elements are:");
       for(int i=0;i<n;i++) {
    	   System.out.println(a[i]);
    	   
       }
       System.out.println("Enter the Number");
       int k = sc.nextInt();
       for(int i=0;i<n;i++) {
    	   if(a[i]==k) {
    		   System.out.println("Position of "+ k + " is " +  i);
    	   }
       }
	}

}
