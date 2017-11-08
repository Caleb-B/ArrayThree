// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class ArrayThree
{  // begin class
	
	final static int MAX = 10;
	
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
		int[] list;
		list = new int[MAX];
		Random Rand = new Random();
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("ArrayExercise 1 Q7");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		for (int i = 0; i < MAX; i++) {
			list[i] = Rand.nextInt(100);
		}
		
		printList(list);
		
		System.out.println(listSum(list));
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main
	
	public static void output(String out) {
		JOptionPane.showMessageDialog(null, out);
	}  // end output
	
	public static void printList(int[] list) {
		for (int i = 0; i < MAX; i++) {
			System.out.println(i + ": " + list[i]);
		}
	}  // end printList
	
	public static int listSum(int[] list) {
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			sum += list[i];
		}
		return sum;
	}
}  // end class