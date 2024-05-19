package Arraybasic;

public class Largesttwonumber {
	public static void main (String args[]) {
		int inputarray[]= {10,50,60,30,90,70,15};
		int f=0;
		int s=0;
		for(int i=0;i<inputarray.length;i++) {
			if(f<inputarray[i]) {
				s=f;
				f=inputarray[i];
			}
			else if(s<inputarray[i]) {
				s=inputarray[i];
			}
		}
		System.out.println("first number ;"+f+"second number :"+s);
			
		
	}

}// largest two numbers or first and second largedzst number.
