package recursion;
//A Recursive Java Program to find Factorial of a 10
public class Factorial {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		long n =10;
		System.out.println("Factorial of " + n + " is : ");
		System.out.println(fact(n));
		System.out.println("Main Ends");
	}
	
	//Recursion
	//n! = nX(n-1)X(n-2)x(n-3)x(n-4).....3X2X1
	static long fact(long x) {
		if (x==0|| x==1) {//Base Condition
			return 1;
		}
		return (x*fact(x-1));//Recursive Call
	}

}
