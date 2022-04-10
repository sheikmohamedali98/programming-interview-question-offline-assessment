public class DiagnolMatrix {
public static void main (String [] args ) {
Scanner in=new Scanner(System.in);
System.out.println("enter the number=");
int n=in.nextInt();
	int number=1;
	int target =15;
 int top=0,left =0;
 int bottom=4, right =4;
	int[][] matrix = new int[n][n]; 
	int row=0 ,col=0;

	
	while(number <=target) {
		while(row<=bottom && col <=right) {
			matrix[row][col]= number;
			row++;
			col++;
			number++;
		}
		left++;
		bottom--;
		col=right;
		row=bottom;
		while(row>=top && number <=target) {
			matrix[row][right]=number;
			row--;
			number++;
		}
		right--;
		bottom--;
		row=top;
		col=right;
		while(col>=left && number <= target) {
			matrix[row][col]= number;
			col--;
			number++;
		}
		top++;
		left++;
		row=top;
		col=left;
	}
	
	// filling the entire matrix of zeroes 
	for (int i=0;i< n ;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(matrix[i][j] +"\t");
		}
		System.out.println("\n");
	}
	
}
}