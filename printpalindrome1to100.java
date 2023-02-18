import java.util.*;

public class printpalindrome1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		for (int n = 1; n <= 100; n++) {
			int a, r = 0, rev = 0;
			a = n;
			while (a > 0) {
				r = a % 10;
				rev= (rev * 10) + r;
				a = a / 10;
			}
			if (n == rev) {
				System.out.println(n);
			}
		}
	}
}
		*/
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the limit of number");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) 
	{
		int a,r=0,rev=0;
		a=i;
		while(a>0) {
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		if(i==rev) {
			System.out.println(i);
		}
	}
	
	}
}

/*
 * Enter the limit of number
100
1
2
3
4
5
6
7
8
9
11
22
33
44
55
66
77
88
99


*/