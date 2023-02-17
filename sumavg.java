import java.util.*;
public class sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of Number : ");
        int n = sc.nextInt();
        int i,sum=0;
        
        for(int j=1;j<=n;j++) {
            System.out.println("Enter the number " +j+ " : ");
            i = sc.nextInt();
            sum+=i;
            
        }
       System.out.println("The Sum of number is "+ sum );
       System.out.println("The Sum of number is "+ sum/n );
	}

}
