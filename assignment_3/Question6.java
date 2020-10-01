package assignment_3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the mg in drink: ");
   int mg = input.nextInt();
   int overdose;
   overdose = 10000/mg; /*since 1gm = 1000mg*/ 
   System.out.println("Number of milligrams in drink: " +mg);
   System.out.println("It would take about " +overdose+ " drinks for a lethal overdose");
	}

}
