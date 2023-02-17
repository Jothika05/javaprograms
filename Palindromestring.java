import java.util.*;
public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String orgs=s; //orgs = originalstring
        int len=s.length();
        String rev ="";
        for (int i = len - 1; i >= 0; i--) 
		{
			rev = rev + s.charAt(i);
		}
        if(orgs.equals(rev)) {
        	System.out.println(orgs +" is Plindrome String");
        	
        }
        else {
        	System.out.println(orgs +" is not Plindrome String");
        }
	}

}
