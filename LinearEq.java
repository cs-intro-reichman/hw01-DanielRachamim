/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
public static void main(String args[]) {
	// Declaring the 3 arguments which the program gets and converting them to double
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	
	// x will be the result that we are looking to print
	double x = (c - b) / a;
	System.out.println(a + " * x" + " + " + b + " = " + c);
	System.out.println("x = " + x);
}
}
