import java.util.*;
public class largestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number:");  
        int b=sc.nextInt();
        System.out.println("Enter the Third Number:");
        int c=sc.nextInt();
        
//        if(a>b && a>c) {
//        	System.out.println(a + " is Largest");
//        	
//        }
//        else if(b>a && b>c) {
//        	System.out.println(b + " is Largest");
//        }
//        else
//        {
//        	System.out.println(c + " is Largest");
//        }
        
        //using ternary operator
        int lar1=a>b?a:b;
        int lar2 = c>lar1?c:lar1;
        
        System.out.println(lar2 +" is Largest");
        
	}

}
