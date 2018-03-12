//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		String a = "u r smrt";
		String b = "random thing";
		String c = "potato";
		String d = "shong";
		String e = "floging";
		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);
		if (randomNumber == 0){
			System.out.println( a);
		}
		else if (randomNumber == 1){
			System.out.println( b);
		}
		else if (randomNumber == 2){
			System.out.println( c);
		}
		else if (randomNumber == 3){
			System.out.println( d);
		}
		else{ System.out.println( e);
			
		}
		// 3. Use each value of randomNumber to give the user a random compliment.
		
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
