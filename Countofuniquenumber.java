package TwoDArray;

public class Countofuniquenumber {

	
	public static void main (String args []){
		int arr[]= {10,20,30,10,40,50,10};
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
		int countofunique=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1) {
				countofunique++;
				
			}
			
		}
		System.out.println(" countofunique number is"+" "+countofunique);
	}
	}

