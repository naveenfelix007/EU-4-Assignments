package assignment_3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   System.out.println("Price in Cents : ");
   int change = input.nextInt();
   change = 100 - change;
   int quarters,dimes,nickle;
    quarters = change/25;
   dimes = change/10;
   nickle = change/5;
   System.out.println("Your change is " +quarters+ " quarters or " +dimes+ " dimes or "+nickle+ " nickles");}

}
