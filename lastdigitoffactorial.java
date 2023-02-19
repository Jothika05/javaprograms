import java.util.*;
public class lastdigitoffactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++) {
        	fact= fact*i;
        }
        int last=fact%10;
        System.out.println("Factorial of given number is: "+last);
	}

}

//output

/*Enter the number
5
Factorial of given number is: 0
*/