import java.util.*;
public class frequencyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Limits");
        int n = sc.nextInt();
        int a[] = new int[n];
        //System.out.println("Enter the Elemnts:");
        for(int i=0;i<n;i++) {
        	a[i]= sc.nextInt();
        	
        }
        System.out.println("Enter the frequency Number :");
        int k = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++) {
        	if(a[i]==k) {
        		count++;
        	}
        	
        }
        System.out.println(count);
	}

}
