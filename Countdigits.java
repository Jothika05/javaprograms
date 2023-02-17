import java.util.*;
public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ;");
        int n = sc.nextInt();
        int count=0;
        while(n>0) {
        	n=n/10;
        	count++;
        }
        System.out.println("Number of Digits is "+ count);
	}

}
