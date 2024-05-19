package Arraybasic;

public class Bubblesort {

	public static void main(String[] args) {
		                                      //Bubble sort
int arr[]= {20,65,48,29,10};
System.out.println("before Bubble sort ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}

for(int i=0;i<arr.length-1;i++) {
	for(int j=0;j<arr.length-1-i;j++) {
		if(arr[j+1]<arr[j]) {
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}
	}
	
	
}
System.out.println();
System.out.println("after Bubble sort");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
}
	}

}
