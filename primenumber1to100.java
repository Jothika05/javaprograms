
public class primenumber1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=100;i++) {
			boolean isprime=true;
			if(i>1) {
				
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						isprime=false;
					}
					
				}
				
				
				
			}
			else {
				isprime=false;
			}
			if(isprime) {
				System.out.println(i+" ");
			}
			
		}
		
		
	}

}
