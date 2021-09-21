package com.company;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        int hiddenNumber;
        hiddenNumber = (int) (Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,
        total=0,
        key;

        while(true)
        {
            total=0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();

            if(key==1)
                hiddenNumber = (int) (Math.random() * 10 + 1);
            else if(key==2)
                hiddenNumber = (int) (Math.random() * 100 + 1);
            else
                hiddenNumber = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What is your guess?: ");
            do
            {
                guess = sc.nextInt();
                total++;
                if (guess == hiddenNumber){
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < hiddenNumber)
                    System.out.println("Too low! Guess again: ");
                else if (guess > hiddenNumber)
                    System.out.println("Too high! Guess again: ");

            }while (guess != hiddenNumber);

            System.out.print(" Play Again? (Y/N)? \n");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }
    }
}
