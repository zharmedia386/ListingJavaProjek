package com.tutorial;

import java.util.Scanner;

public class Retirement2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("How much money will you retire?");
    double payment = input.nextDouble();

    System.out.println("Interest rate in % : ");
    double interestRate = input.nextDouble();

    double balance = 0;
    int year = 0;

    String temp;

    do {
      balance += payment;
      double interest = balance * interestRate / 100;
      balance += interest;

      year++;

      System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

      System.out.println("Ready to retire? (Y/N)");
      temp = input.next();
    } while (temp.equals("N"));
  }
}