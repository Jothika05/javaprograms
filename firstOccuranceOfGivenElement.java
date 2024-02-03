import java.util.*;
public class firstOccuranceOfGivenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int[] a = {1,3,4,5,8,6,8,3,9};
       System.out.println("Enter any number");
       int num = sc.nextInt();
       
       boolean isfound=false;
       
       
       for(int i=0;i<a.length;i++) {
    	   if(num==a[i]) {
    		   System.out.println("number was found in "+ num +" this index"+i);
    		   isfound=true;
    		   break;
    	   }
       }
       if(!isfound) {
    	   System.out.println("your number is not found in list ");
       }
	}

}
