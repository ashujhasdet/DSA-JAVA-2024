package recursion;
//A Recursive Java Program to find 20th Fibonacci Number.
public class FibonacciNumber {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		long n = 20;
		System.out.println(n+"th"+" Fibonacci Number is :");
		System.out.println(fibo(n));
		System.out.println("Main Ends");
	}
	//Recursion
	//Fibonacci(3)=Fibonacci(2)+Fibonacci(1)
	static long fibo(long x) {
		if(x==0||x==1) {
			return x;//Base Condition
		}
		//Recursive Call
		return(fibo(x-1)+fibo(x-2));
	}

}
