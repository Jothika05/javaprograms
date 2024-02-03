


class calculator1{
	public int add(int a1,int a2) {
		return a1+a2;
	}
	
	
	
	
}
class advcal extends calculator{
	public int add(int a1,int a2) {
		return a1+a2+1;
	}
}
public class methodOverrinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      advcal obj = new advcal();
      int r1 = obj.add(5, 7);
      System.out.println(r1);
	}

}
