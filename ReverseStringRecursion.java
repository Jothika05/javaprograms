
public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "Dinesh";
      System.out.println(recursiveString(str));
	}
	public static String recursiveString(String str) {
		
		if(str==null || str.length()<=1){
			return str;
		}
		
		return recursiveString(str.substring(1)) +str.charAt(0) ;
		
	}

}
