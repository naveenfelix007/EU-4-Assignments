package assignment_3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double liters;
  int gallon;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the gallons that need to be converted:");
  gallon = input.nextInt();
  liters = gallon * 3.78541;
  System.out.println("Converted Liters is " +liters);
	}

}
