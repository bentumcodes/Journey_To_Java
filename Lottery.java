import java.util.Scanner;
public class Lottery{
public static void main(String[] args){
	//Generate a lottery number
	int lottery = (int)(Math.random()) * 100);
	
	//Prompt the user to enter a guess
	System.out.println("Guess a number: ");
	
	//Take input from the user
	Scanner input = new Scanner(System.in);
	
	int guess = input.nextInt();
	
	//Get digits from lottery
	int lotteryDigit1 = lottery /10;
	int lotteryDigit2 = lottery % 10;
	
	//Get digits from Guess	
	int guessDigit1 = guess /10;
	int guessDigit2 = guess % 10;
	
	System.out.println("The lottery number is " + lottery);
	
	//Check the guess
	if (guess == lottery)
		System.out.println("Exact match: you win $10,000"):
	else if (guessDigit2 == lottery