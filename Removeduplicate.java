package TwoDArray;

public class Removeduplicate {
public static void main(String args[]) {
	int arr[]= {1,2,2,3,3,4,5,6};
	int len=arr.length;
	int temp[]=new int[arr.length];
	int j=0;
	for(int i=0;i<len-1;i++) {
		if(arr[i] != arr[i+1])
		{
			
			temp[j]=arr[i];
			j++;
		}
	}
	temp[j]=arr[len-1];
	j++;
	for(int k=0;k<j;k++) {
		System.out.println(temp[k]);
	}
}
}
