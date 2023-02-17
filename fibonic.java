import java.util.Scanner;
public class fibonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int a=-1,b=1,c;
        
        for(int i=1;i<=n;i++) {
        	c=a+b;
        	a=b;
        	b=c;
        	System.out.println(c);
        	
        }
	}
/*


fibonic series print 0,next print 1,next add two number 0+1=1,
	
	next 1+1=2 next 2+1=3 */
}
