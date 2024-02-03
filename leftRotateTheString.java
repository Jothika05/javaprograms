
public class leftRotateTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "Dineshkumar";
          
          char[] ca = str.toCharArray();
          
          int size = ca.length;
          
          char first =ca[0];
          
          
          for(int i=0;i<size-1;i++) {
        	  
        	  ca[i] = ca[i+1];
          }
          
          ca[size-1]= first;
          
          
          
          StringBuffer sb = new StringBuffer();
          
          for(char c : ca) {
        	  sb.append(c);
          }
          
          System.out.println(sb);
	}

}
