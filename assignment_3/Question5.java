package assignment_3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the input seconds : ");
   int seconds = input.nextInt();
   int hour = seconds/3600;
   int min = seconds%3600/60;
   int seconds1 = seconds%60;
   System.out.println("Time is " +hour+ " hours, " +min+ " mins, " +seconds1+" seconds");
	}

}
