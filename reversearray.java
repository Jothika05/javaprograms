import java.util.*;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elemnts");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + i + " element");
			a[i] = sc.nextInt();
			
		}
		System.out.println("Reversed elemnts are :");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");

		}

	}

}
