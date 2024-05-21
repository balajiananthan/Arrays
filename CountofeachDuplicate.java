package TwoDArray;

public class CountofeachDuplicate {
	public static void main (String args []){
		int arr[]= {10,20,30,10,40,50,20,10};
		int freq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=-1;
				}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
			}
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=1) {
				
				System.out.println(arr[i]+"count of each duplicate element"+freq[i]);
			}	
		}
	}
		
}