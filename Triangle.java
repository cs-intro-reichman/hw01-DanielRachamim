/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
public static void main(String[] args) {
	//Declaring the 3 arguments which the program gets and converting them to integers
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	//We need all 3 mathematical claims to be true to get a possible triangle
	if (a + b > c & b + c > a & a + c > b) {
		System.out.println(a + ", " + b + ", " + c + ": true");
	}   else {
		System.out.println(a + ", " + b + ", " + c + ": false");
	}
	}
}
