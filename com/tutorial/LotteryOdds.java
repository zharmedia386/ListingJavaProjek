package com.tutorial;

import java.util.*;

public class LotteryOdds {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("How many numbers do you need to draw? ");
    int k = input.nextInt();

    System.out.println("What is the highest number you can draw");
    int n = input.nextInt();

    /**
     * Compute Binomial Coefficient = n*(n-1)*(n-2)*...*(n-k+1) / 1*2*3..*k
     */

    int lotteryOdds = 1;
    for (int i = 1; i <= k; i++) {
      lotteryOdds = lotteryOdds * (n - i + 1) / i;
      System.out.printf("Your odds are 1 in %d. Good Luck!\n", lotteryOdds);
    }
  }
}