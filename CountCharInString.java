
public  class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String Str ="Dinesh Kumar";
         charCount(Str);
	}

	private static void charCount(String str) {
		// TODO Auto-generated method stub
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			String s = "";
			while(i< ch.length && ch[i]!=' ') {
				s=s+ch[i];
				i++;
			}
			if(s.length()>0) {
				System.out.println(s+"->"+s.length());
			}
		}
	}

}
