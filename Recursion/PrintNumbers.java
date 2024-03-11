package recursion;
// A Recursive java program to print numbers from 1 to 100 
public class PrintNumbers {
	public static void main (String [] args) {
		System.out.println("Main Starts");
		int i =1;
		printNumbers(i);//call a method printNumbers to print 1 to 100
		
		System.out.println("Main Ends");
	}
	static void printNumbers(int i) {
		if(i==100) {// This is the termination condition 
			System.out.println(i);
			return;
		}
		System.out.println(i);// print values
		printNumbers(i+1);// RECURSIVE FUNCTION CALL
		
	}

}
