import java.util.*;
public class findelementinarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       // System.out.println("ENter the number of limits");
       // int n = sc.nextInt();
        
        
        int arr[] = {1,4,3,2};
        boolean found = false;
      // System.out.println("ENter the number of elements");
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
       // System.out.println("ENter the key to search");
        int found1 = sc.nextInt();
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==found1) {
        		found =true;
        		break;
        	}
        }
        if(found) {
        System.out.println("1");
        }
        else {
        	System.out.println("0");
        }
       
    }
}