import java.util.Scanner;
public class sumofnumarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enther the number of elemrnts :");
      int n = sc.nextInt();   
      int c[]=new int[10];
      int sum=0;
      for(int i=0;i<=n;i++) { 
    	  System.out.println("Enter the number : ");
    	   c[i]= sc.nextInt();
    	  sum +=c[i];
    	  
      }
      System.out.println(sum);
	}

}
