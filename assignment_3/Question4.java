package assignment_3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number 1: ");
      int num1 = input.nextInt();
      System.out.println("Enter the number 2: ");
      int num2 = input.nextInt();
      int temp;
      temp = num2;
      num2 = num1;
      num1 = temp;
      System.out.println("The swapped output is " +num1+ " and " +num2);
    		  }

}
