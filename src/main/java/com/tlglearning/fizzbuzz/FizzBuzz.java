package com.tlglearning.fizzbuzz;

import com.tlglearning.fizzbuzz.model.Analysis;
import com.tlglearning.fizzbuzz.model.State;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import org.apache.commons.cli.Options;

public class FizzBuzz {

  private static final int DEFAULT_UPPER_BOUND =100;

  public static void main(String[] args) {

    try {
      int upperBound = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_UPPER_BOUND;
      if (upperBound <=0){
        throw new IllegalArgumentException();
      }
      Analysis analysis = new Analysis();
      for (int counter = 1 ; counter <=upperBound ; counter ++){
        Set<State> result = analysis.analyze(counter);
        System.out.println(result.isEmpty() ? counter: counter + " " + result);
      }
    } catch (IllegalArgumentException e) {
      System.out.printf("Usage: java %1$s [upperBound]%n", FizzBuzz.class.getName());
      System.out.printf("Where upperBound is a positive integer, with a default of 100\n");
      //throw new RuntimeException("FizzBuzz Halted! , ", e);
    }finally {
      System.out.println("Thanks for playing FizzBuzz!!");
    }

////    // Declare all varibales
//int noOfLines;
////    // Use Scanner to accept no of lines pattern
////    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter no of lines for pattern you want: ");
//    noOfLines = sc.nextInt();
//    // Display left staircase pattern
//    System.out.println("Left Staircase Pattern:");
//    for(int row = 0; row < noOfLines; row++) {
//      for(int col = 0; col < noOfLines; col++) {
//        if(row >= col)
//          System.out.print("#");
//      }
//      // Display in a new line
//      System.out.println();
//
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter no of lines for pattern you want: ");
//      noOfLines = sc.nextInt();
//      // Display left staircase pattern
//      System.out.println("Right Staircase Pattern:");
//      for (int row = 0; row < noOfLines; row++) {
//        for (int col = 0; col < noOfLines; col++) {
//          if (col < noOfLines - row - 1)
//            System.out.print(" ");
//          else
//            System.out.print("#");
//        }
//        // Display in a new line
//        System.out.println();
//    }

  }}



