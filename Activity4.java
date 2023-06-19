package class2p;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	    double val1, val2, val3;
        System.out.println("Please give me the first num?");
        val1 = kb.nextDouble();
	    System.out.println("Please give me the second num?");
		val2 = kb.nextDouble();
		System.out.println("Please give me the third num?");
		val3 = kb.nextDouble();
		double avg = (val1 + val2 + val3)/3.0;
		System.out.println("the average of the numbers: " + avg);
	
	}

}
