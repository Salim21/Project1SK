/*
Salim K
Jan 27, 2020
HelloWorld.java
*/

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("Hello, " + name + "!");
	}	
}	
