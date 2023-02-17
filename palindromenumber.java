import java.util.*;
public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int n = sc.nextInt();
       int rev=0;
       int num=n;
       //System.out.println(num);
       while(n!=0) {
    	   rev=rev*10+n%10;
    	   n=n/10;
       }
       if(num==rev) {
    	   System.out.println(num +" is Palindrome Nmber");
       }
       else {
    	   System.out.println(num +" is Not a Palindrome Nmber");
       }
	}

}
