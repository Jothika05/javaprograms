
public class swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       a=10;
       b=20;
       System.out.println("Before Swapping :"+ "a is "+a+ " b is " +b);
       // Using Third Variable
       c=a;
       a=b;
       b=c;
       System.out.println("After Swapping :"+ "a is "+a+ " b is " +b);
	}

}
/*without using third variable
 * 
 * a=a+b;
 * b=a-b;
 * a=a-b;
 */

