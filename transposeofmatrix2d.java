
public class transposeofmatrix2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Before transepose");
        for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
        transposeofmatrix(a);
	}
	public static void transposeofmatrix(int[][] a) {
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				 int temp = a[i][j];
				 a[i][j] = a[j][i];
				 a[j][i] = temp;
				
			}
		}
		System.out.println("After transpose of matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
