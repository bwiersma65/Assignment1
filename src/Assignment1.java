// CMSC203 - Professor Monshi
// Assignment 1 - Monthly Payment Calculator
// Ben Wiersma

import java.util.Scanner; // Header statement to import Scanner class for use in i/o

public class Assignment1 
// This class calculates the regular monthly payment required for paying off a loan of a specified amount //
   // with a specified interest rate and over the course of a specified number of payments, as designated //
																						   // by the user //
{

////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) 
	{
		
		int loanAmount, numberOfPayments;
		double interestRate, payment;
		Scanner userInput = new Scanner(System.in); // Declaration of variables //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}
		
		System.out.println("Hello! Welcome to the Monthly Payment Calculator!" 
		+ "\n\n" + "Please enter the monetary value of the loan requested (without commas): ");
													// Greeting and prompt for value of loan //
		loanAmount = userInput.nextInt();
									  // Assignment of keyboard input to variable loanAmount // 
		System.out.println("You entered $" + loanAmount);
					  // Restatement of received input //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		while ( loanAmount < 0 ) 
		{
			System.out.println("Remember that the monetary value of the loan cannot fall short of $0\n"
					+ "Please enter the monetary value of the loan requested (without commas): ");
			loanAmount = userInput.nextInt();
			System.out.println("You entered $" + loanAmount);
		}
																				// Input validation //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		System.out.println("Please enter the specified interest rate (as a percentage) for this loan: ");
																		   // Prompt for interest rate //
		interestRate = userInput.nextDouble();
				// Assign input to variable //
		System.out.println("You entered " + interestRate + "%");
									  // Restatement of input //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		while ( interestRate < 0 ) 
		{
			System.out.println("Remember that the interest rate of the loan cannot fall short of 0%\n"
					+ "Please enter the interest rate (as a percentage) for this loan: ");
			interestRate = userInput.nextDouble();
			System.out.println("You entered " + interestRate + "%");
		} 
																				// Input validation //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		System.out.println("Finally, please enter the number of payments with which "
				+ "the loan will be paid off: ");
												  // Prompt for number of payments //
		numberOfPayments = userInput.nextInt();
				 // Assign input to variable //
		System.out.println("You entered " + numberOfPayments);
									// Restatement of input //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		while (numberOfPayments < 1)
		{
			System.out.println("Remember that the loan must be paid off in at least one payment\n"
					+ "Please enter the number of payments with which the loan will be paid off: ");
			numberOfPayments = userInput.nextInt();
			System.out.println("You entered " + numberOfPayments);
		}
																			  // Input validation //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		payment = loanAmount*(((interestRate/100)/12.0)/(1.0-
				(Math.pow((1.0+((interestRate/100)/12.0)), (-1.0*numberOfPayments)))));
											  // Calculation of monthly loan payment //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}
		System.out.println("The total monthly payment for a loan of " + loanAmount + " is " + payment);
		
																	
																	// Output of monthly loan amount //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}

		userInput.close();
  // Closes the scanner //
////////////////////////////////////////////////////////////////////////////////////////////////////////////}
	}
}

