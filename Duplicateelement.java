package search;

public class Duplicateelement {
	public static void main(String args[]) {
		int arr[]= {10,20,30,20,30,20,30,40,50,50};
		int freq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			
		
		int no=arr[i];
		int count=1;
		for(int j=i+1;j<arr.length;j++)
		{
			if(no==arr[j]) {
			count++;
			freq[j]=-1;
		}
		}
		if(freq[i]!=-1) {
			freq[i]=count;
		}
		}
		int dupcount=0;
		for(int i=0;i<arr.length;i++) {
			if(freq[i]>1) {
				dupcount++;
			}
			
			System.out.println("duplicate elements are"+dupcount);
		}
	}
}
		//count of unique-count of duplicate number single-count of all numbers-copy of dupicate elemnent//
			
		
	


