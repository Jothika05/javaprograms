import java.util.*;
public class removeDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str = "Ethu action Madam";
		
		Set<Character> strchar = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			strchar.add(str.charAt(i));
		}
		StringBuffer sb =  new StringBuffer();
		
		for(Character c : strchar) {
			sb.append(c);
		}
		System.out.println("After remove the duplicate charcter is " + sb );
		
	}

}
