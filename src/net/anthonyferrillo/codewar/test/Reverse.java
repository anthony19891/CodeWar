package net.anthonyferrillo.codewar.test;

/**
 * 
 * Your objective is to complete a recursive function reverse() that 
 * receives str as String and returns the same string in reverse order
 * 
 * Rules:
 * - reverse function should be executed only N times. N = length of the input string
 * - helper functions are not allowed 
 * - changing the signature of the function is not allowed
 */
public class Reverse {

	public String reverse(String str) {
		if(str.length() <= 1 || str == null) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverse("hello world"));
	}
}
