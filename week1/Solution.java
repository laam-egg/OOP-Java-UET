package week1;

class Solution {
	public static void main(String[] args) {
		if (args.length >= 1) printHello(args[0]);
		else printHello("");
	}
	
	private static void printHello(String username) {
		System.out.println("Hello " + username + "!");
	}
};
