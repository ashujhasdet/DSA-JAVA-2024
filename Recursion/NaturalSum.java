package recursion;
// A Recursive Java Program to find sum of Natural Numbers from 100 to 200
public class NaturalSum {
	public static void main (String[] args) {
		
		int n = 100;
		System.out.println(sum(n));
	}
	
	//Recursion
	/*    
	 LOGIC : SUM FROM 3 TO 7
	 3 + SUM(4)--> 4 + SUM(5)-->5+SUM(6)+6+SUM(7)--> BASE CONDITION 
	 RETURN 7 
	 MEANS 7+6=13--> 13+5=18-->18+4 =22-->22+3-->25
	 RETURN 25
	  */
	static int sum(int x) {
		if (x==200) {
			return x;
		}
		return (x+sum(x+1));//Recursive Call
		
	}

}
