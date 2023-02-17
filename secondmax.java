
import java.util.Scanner;

public class secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the limits");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++) {
        	a[i] = sc.nextInt();
        	
        }
        System.out.println("Elements are :");
        for(int i=0;i<n;i++) {
        	System.out.println(a[i]+" ");
        }
        int first = 0;
        int second = 0;
        
        for(int i=0;i<n;i++) {
        	if(a[i]>first) {
        		second = first;
        		first = a[i];
        	}
        	else if (a[i]>second) {
        		second=a[i];
        	}
        
        }
        System.out.println("First Maximum elements is " + first);
        System.out.println("Second Maximum elements is "+ second);
	}

}

