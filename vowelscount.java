import java.util.*;
public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        int count = 0;
        for(int i=0;i<s1.length();i++) {
        	char ch = s1.charAt(i);
        	
        	switch(ch){
        	case 'a' : count++; break;
        	case 'e' : count++; break;
        	case 'i' : count++; break;
        	case 'o' : count++; break;
        	case 'u' : count++; break;
        	
        	}
        	
        }
        System.out.println("Vowels count is : " + count);
	}

}

/*
   using logical or operator
   
   import java.util.*;
public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         String s1 = sc.nextLine();
         int count =0;
         for(int i=0;i<s1.length();i++) {
        	
        	 if(s1.charAt(i) == 'a' || s1.charAt(i) =='e' || s1.charAt(i)== 'i' ||s1.charAt(i) == 'o'|| s1.charAt(i)=='u' ) {
        		 count++;
        	 }
        	 
        	 }
         System.out.println("Count of Vowels is :" + count);
         }
	}
   
   
 */
/*
import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("ENter the String");
        String str = sc.nextLine();
        char chars[] = str.toCharArray();
        int count =0;
        for (char c : chars) {
			
        	switch(c){
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        	    count++;
        	    break;
        	}
		}
        System.out.println("Number of vowels in String is "+ count);
	}

}

*/
