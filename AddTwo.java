/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
public static void main(String[] args) {
	//turning a and b to int from string
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	//Printing the sum
	System.out.println(a + " + " + b + " = " + (a + b));	
	}
}
