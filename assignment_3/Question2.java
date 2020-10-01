package assignment_3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your name : ");
	 String name = input.next();
	 System.out.println("Enter your Birth Year : ");
	 int birthyear = input.nextInt();
     int currentyear= 2020;
     int age = currentyear - birthyear;
     System.out.println(" Hello, " +name+ "\n Based on your input, Your age is " +age);
	}

}
