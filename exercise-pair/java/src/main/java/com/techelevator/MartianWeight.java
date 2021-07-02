package com.techelevator;
import java.util.Scanner;
import java.util.Arrays;


/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		System.out.print("Enter a series of Earth weights (space-seperated):");
		Scanner scanner = new Scanner(System.in);
		//get inputs from the user
		String weightStr = scanner.nextLine();
		//create an array and add the inputs
		String[] weightArray = weightStr.split(" ");
		for(int i = 0; i < weightArray.length; i++){
		int martianWeight = Integer.parseInt(weightStr);
		int mWeight = (int)(martianWeight * 0.378);

		}


	}

}
