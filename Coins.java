/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
	// a is the given string argument, we will convert it to int
	int a = Integer.parseInt(args[0]);
	//The cents are equal to the the result of the modolu because they are the numbers after the dot
	int cents = a % 25;
	//The quarters are equal to the the result of the division because they are the numbers before the dot
	int quarters = a / 25;
	System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}
