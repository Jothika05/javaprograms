import java.beans.DefaultPersistenceDelegate;
import java.util.*;
public class numberofwordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        
        String[] strspilt = str.split(" ");
        System.out.println("Number of words in given string is " +strspilt.length);
	}

}
