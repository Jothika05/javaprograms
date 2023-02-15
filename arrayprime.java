import java.util.*;
public class arrayprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of Elemtnts");
       int n = sc.nextInt();
       int [] a = new int[n];
       
       for(int i=0;i<a.length;i++)
       {
    	
    	   a[i]=sc.nextInt();
    	   
       }
       
       System.out.println("Prime Numbers are :");
       for(int i=0;i<n;i++)
       {
             int counter=0;
             for(int j=2;j<a[i];j++)
             {
                   if(a[i]%j==0)
                   {
                         counter=1;
                         break;
                   }
             }
             if(counter==0)
             {
               
                   System.out.println(a[i]);
             }
       }
	}

}
