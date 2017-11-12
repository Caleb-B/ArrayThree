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
	
	final static int MAX = 100;
	
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
		int[] list;
		list = new int[MAX];
		Random Rand = new Random();
		String out;
		int i = 0;
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("ArrayExercise 1 Q7");
		out = Printer.getBanner("ArrayExercise 1 Q7");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		while (i < MAX) {
			list[i] = Rand.nextInt(100);
			if (list[i] == 0) {
				i = MAX;
			}
			i++;
		}
		
		out += printList(list);
		
		System.out.println("");
		
		System.out.println("Total Sum:	" + listSum(list));
		out += "Total Sum:	" + listSum(list) + "\n";
		
		System.out.println("Average:	" + listAvg(list));
		out += "Average:	" + listAvg(list) + "\n";
		
		System.out.println("Maximum:	" + listMax(list));
		out += "Maximum:	" + listMax(list) + "\n";
		
		System.out.println("Minimum:	" + listMin(list));
		out += "Minimum:	" + listMin(list) + "\n\n";
		
		System.out.println("");
		
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
		out += Printer.getClosing();
		output(out);

	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main
	
	public static void output(String out) {
		JOptionPane.showMessageDialog(null, out);
	}  // end output
	
	public static String printList(int[] list) {
		String out = "";
		for (int i = 0; i < MAX; i++) {
			System.out.println(i + ": " + list[i]);
			out += i + ": " + list[i] + "\n";
		}
		return out;
	}  // end printList
	
	public static int listSum(int[] list) {
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			sum += list[i];
		}
		return sum;
	}  // end listSum
	
	public static int listAvg(int[] list) {
		return listSum(list) / MAX;
	}  // end listAvg
	
	public static int listMax(int[] list) {
		int max = list[0];
		for (int i = 0; i < MAX; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}  // end listMax
	
	public static int listMin(int[] list) {
		int min = list[0];
		for (int i = 0; i < MAX; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}  // end listMin
}  // end class