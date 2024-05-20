package TwoDArray;

public class Matrix {
	public static void main( String args[]) {
int arr[][]=new int[3][3];
int val=100;

int row=0;
while(row<3) {
	int col=0;
	while(col<3) {
		arr[row][col]=val;
		val+=100;
		col++;
		
	}
	row++;
}

for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}
}
