/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	//turning a and b into int from string – this is the range given by the user 
	int minRange = Integer.parseInt(args[0]);
	int maxRange = Integer.parseInt(args[1]);
		
	//generating the numbers in the given range
	double rand1 = Math.random()*(maxRange-minRange)+minRange;
	double rand2 = Math.random()*(maxRange-minRange)+minRange;
	double rand3 = Math.random()*(maxRange-minRange)+minRange;
		
	//printing each number as an integer
	System.out.println((int)rand1);
	System.out.println((int)rand2);
	System.out.println((int)rand3);
		
	//comparing between the first number and the second one to get the min 
	int min1 = ((int)Math.min(rand1, rand2));
	//Getting the minimum value that was generated (as an integer)
	int min2 = ((int)Math.min(min1, rand3));
		
	//Printing the minimal generated number
	System.out.println("The minimal generated number was " + min2);	
	}
}
