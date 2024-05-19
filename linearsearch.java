package search;

public class linearsearch {
public static void main (String args[])
{
	int arr[]= {5,7,9,11,15};
	int element=9;
	boolean flag=false;
	for(int i=0;i<arr.length;i++)
	{
		if(element==arr[i])
	 flag=true;
}
	if(flag==true)
	{
		System.out.println("elememt found");
	}
	else {
		System.out.println("element not found");
	}
}
}
	

