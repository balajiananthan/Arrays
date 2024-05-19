package Arraybasic;

public class Sorting {
	public static void main (String args[])
	{
		int arr[]= {7,4,2,1,6};
		for(int i=0;i<arr.length;i++) {
			System.out.print( arr[i]+" ");
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		
		}
		System.out.println("after sorting");
		for(int i=0;i<arr.length;i++) {
			

		
			System.out.print(arr[i]+" ");
		}
		int len=arr.length;
			System.out.println( "max is"+ arr[len-1]);
			
			
			
			
			
		
		//sorting
		
}
}
