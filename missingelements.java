package arrayLearning;

public class missingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,7,8};
		int total=0;
		int sum=0;
		int miss;
		for(int i=4;i<9;i++)
		{
			total=total+i;
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		miss =total-sum;
		System.out.println(" missing number is "+miss);
	
		}

	}


