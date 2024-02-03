

class calculator{
	public int add(int a1, int a2) {
		return a1+a2;
	}
	public int add(int a1 , int a2,int a3) {
		return a1+a2+a3;
	}
	
	
	
}
public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        calculator odj = new calculator();
       int r1 =  odj.add(3,5);
        int r2 =odj.add(5,7,9);
        System.out.println(r1);
        System.out.println(r2);
	}

}
