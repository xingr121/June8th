package class2p;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner kb = new Scanner(System.in);
         System.out.println("Please enter a number: ");
		int num = kb.nextInt();
         for (int i = 1; i<=10; i++) {
        	 int mult = i * num;
        	 System.out.print(num);
        	 System.out.print(" x ");
        	 System.out.print(i);
        	System.out.println(" = " + mult);
         };
         
	}

}
