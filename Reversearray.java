package Reversearray;

public class Reversearray  {

	public static void main(String[] args) {
		int arr[]= {2,5,6,7,4};
		int temp;
		int i=0;
		
		int j=arr.length-1;
		while(i<=j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++){
				System.out.println((k));
	    }
			
		}
		// TODO Auto-generated method stub

	}



