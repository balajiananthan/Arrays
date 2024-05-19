package Rightrotate;

public class Rightrotate {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=temp;
	System.out.println(" after right shift");
	for(int k=0;k<arr.length;k++) {
		System.out.println(arr[k]+" ");
	}
}
	}
// arr[5]=arr[4];arr[4]=arr[3];arr[2]=arr[1];arr[1]=arr[0],arr[0]=temp'


	
