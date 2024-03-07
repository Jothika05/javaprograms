
public class CompareStringWithoutBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1 = "Dine";
      String str2 ="Diesh";
      boolean iscompare=false;
      
      
      for(int i=0;i<str1.length();i++) {
    	  if(str1.charAt(i)!=str2.charAt(i)) {
    		  iscompare=false;
    		  break;
    	  }
    	  iscompare=true;
      }
      System.out.println("String is "+ iscompare);
	}

}
