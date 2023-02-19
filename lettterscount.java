import java.util.*;
public class lettterscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
       int caps = 0;
       int small =0;
       int num=0;
       int special =0;
       int space =0;
    	for(int  i=0;i<str.length();i++) {
    		if(str.charAt(i)>='A'&& str.charAt(i)<='Z') {
    			caps++;
    		}
    		else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
    			small++;
    		}
    		else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
    			num++;
    		}
    		else if(str.charAt(i)==32) {
    			space++;
    		}
    		else {
    			special++;
    		}
    	}
    	System.out.println("Capital letters Count is :"+caps );
    	System.out.println("Small letters Count is :"+small );
    	System.out.println("number  Count is :"+num );
    	System.out.println("special letters Count is :"+special );
    	System.out.println("space Count is :"+space );
    	
       
	}

}
/*
 * Enter the string
ABC abc @!. 123
Capital letters Count is :3
Small letters Count is :3
number  Count is :3
special letters Count is :3
space Count is :3

 * */
