import java.util.*;
public class GuessingGame
{
public static void main(String args[])
{
  Scanner playerGuess = new Scanner (System.in);
  int count = 0;
  int a = 1 + (int) (Math.random() * 99);
  int guess = 0;
  
  System.out.println ("I am thinking of a number between 1 and 100" + "... guess what it is?");
  
  while (guess !=a)
  {
    guess = playerGuess.nextInt();
    count++;
    if (guess > a)
    {
      System.out.println("I'm sorry, that guess is too high");
    }
    else if (guess < a)
    {
      System.out.println ("Actually, this integer is too low!");
    }
  }
  System.out.println("Congratulations. You guessed the number with " +count+ " tries!");
}
}