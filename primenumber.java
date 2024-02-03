import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        System.out.println("ENter any number ");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isprime = false;
                }
                
            }
        }
        else{
            isprime= false;
        }
        
        if(isprime){
            System.out.println("prime number");
            
        }
        else{
            System.out.println("not prime number");
        }
	}

}
