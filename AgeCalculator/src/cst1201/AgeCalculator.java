package cst1201;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Calculates ages using a given year.
 *
 * @author Raffi Khatchadourian.
 */
public class AgeCalculator {

	public static void main(String[] args) {
		//Get the current year.
		int currentYear = LocalDate.now().getYear();

		//Ask the user for their age.
		System.out.print("How old are you? ");

		//Create a scanner to retrieve user input.
		Scanner scanner = new Scanner(System.in);

		//Retrieve user input.
		int currentAge = scanner.nextInt();

		//Ask the user for another year.
		System.out.print("Enter another year: ");
		int anotherYear = scanner.nextInt();

		//Calculate the user's age in the year retrieved in the previous step.
		//First, we need to know how many years to add to the user's current age.
		//This will be the other year minus the current year.
		int yearsToAdd = anotherYear - currentYear;

		//Next, we add the result from above to the user's current age.
		int newAge = currentAge + yearsToAdd;

		//Finally, display the user's age in this year, but only if it's valid.
		if (newAge > currentAge){
			System.out.println("You will be " + newAge + "-years-old in "
				+ anotherYear + ".");}
                else  if (newAge <0 )
                    System.out.println("You weren't born ");  
                
                else  if (newAge <= 1)
                  System.out.println("You were " + newAge + "-year-old in "
				+ anotherYear + ".");   
                
                else  if (newAge < currentAge)
                      System.out.println("You were " + newAge + "-years-old in "
				+ anotherYear + "."); 
              
                
		/*
		 EXTRA CREDIT 1: Use an else statement above to output an error message. This
		 corresponds to the case where the user wasn't born yet.
		
		 EXTRA CREDIT 2: Notice that we say "years-old" above. What if they are only 
		 1-year-old? Fix this output for this special case above.
		
		 EXTRA CREDIT 3: If we enter a year in the past, the output doesn't seem correct.
		 If the year is in the past, modify the output so that it says "you were" instead
		 of "you will."
		
		 NOTE: When submitting the extra credit, please indicate which one(s) you are
		 attemtping.
		 */
	}
}
