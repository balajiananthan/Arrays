package arrayLearning;

public class missingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {0,1,2,3,4,5,6,7,9};
		int sum=0;
		int total=0;
		for(int i=0;i<n.length;i++)
		{
			total+=n[i];
		}
		for(int j=0;j<n.length;j++)
		{
		sum+=j;

	}
System.out.println(total);
System.out.println(sum);
System.out.println(sum-total);
	}
}
