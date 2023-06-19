package class2p;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner kb = new Scanner(System.in);
   System.out.println("please enter two numbers as the value of a and b:");
   int a = kb.nextInt();
   int b = kb.nextInt();
   System.out.println("before swapping:");
   System.out.println("a = " + a);
   System.out.println("b = " + b);
   
   int temp = a;
   a = b;
   b = temp;
   System.out.println("after swapping:");
   System.out.println("a = " + a);
   System.out.println("b = " + b);
		   
	}

}
