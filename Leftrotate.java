package Leftrotate;

public class Leftrotate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		
		}
		arr[arr.length-1]=temp;
		System.out.println(" after Shifting");
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");
		}
		// TODO Auto-generated method stubar//        a[0]=a[1];a[1]=a[2];a[2]=a[3];a[3]=a[4];a[4]=a[5];   2,3,4,5,6,1
		                                              

	}

}
