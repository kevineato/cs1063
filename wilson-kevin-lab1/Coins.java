// Coins.java
// Kevin Wilson
// Lab 1 - Converts coins to dollars and vice versa

import java.util.*;

public class Coins
{
  // Scanner class constant
  public static final Scanner INPUT = new Scanner( System.in );

  // Entry point to program
  public static void main( String[] args )
  {
    makeHeader();
    convertToDollars();
    convertToCoins();
  }

  // Get name and print header
  public static void makeHeader()
  {
    System.out.print( "Please enter your name: " );
    String name = INPUT.nextLine();
    System.out.println( "\nLab 1 written by " + name + "\n" );
  }

  // Get amount of coins and convert to dollar value
  public static void convertToDollars()
  {
    System.out.println( "Please enter a number for each type of coin to see the total value" );

    System.out.print( "Quarters: " );
    int quarters = INPUT.nextInt();
    System.out.print( "Dimes: " );
    int dimes = INPUT.nextInt();
    System.out.print( "Nickels: " );
    int nickels = INPUT.nextInt();
    System.out.print( "Pennies: " );
    int pennies = INPUT.nextInt();
    System.out.println();
    int totalCoins = quarters + dimes + nickels + pennies;

    int value = 0;
    value += quarters * 25;
    value += dimes * 10;
    value += nickels * 05;
    value += pennies * 1;
    double finalValue = value / 100.0;

    System.out.println( "Total coins: " + totalCoins );
    System.out.println( "Value: $" + finalValue + "\n" );
  }

  // Get dollar value and print amount of coins to equal value
  public static void convertToCoins()
  {
    System.out.print( "Please enter a valid monetary value: $" );
    double value = INPUT.nextDouble();
    System.out.println();

    int cents = ( int ) ( value * 100 );
    int dollars = cents / 100;
    cents %= 100;
    int quarters = cents / 25;
    cents %= 25;
    int dimes = cents / 10;
    cents %= 10;
    int nickels = cents / 5;
    cents %= 5;
    int pennies = cents;

    System.out.println( "To add up to $" + value + " it takes:\n" );
    System.out.println( "Dollars: " + dollars );
    System.out.println( "Quarters: " + quarters );
    System.out.println( "Dimes: " + dimes );
    System.out.println( "Nickels: " + nickels );
    System.out.println( "Pennies: " + pennies );
  }
}
