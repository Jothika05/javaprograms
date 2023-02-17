import java.util.*;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String s = sc.nextLine();
		int len = s.length();
		String rev = "";
		/*for (int i = len - 1; i >= 0; i--) 
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("String reverse is : " + rev);*/
		
		//2.Using CharArray
		
		/*char a[]=s.toCharArray();
		int alen=a.length;
		
		for(int i=alen-1;i>=0;i--) {
			rev = rev+a[i];
		}
		System.out.println("String reverse is : " + rev);*/
		
		
		//3.StringBuffer
		
		StringBuffer sb= new StringBuffer(s);
		System.out.println("String Reverse is :" +sb.reverse());
		
	}

}
