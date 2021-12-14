
package ybornexercise;

import java.util.Scanner;


public class YBornExercise {

  
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      String name;
      int yearBorn, age;
      int currentYear = 2021;
      String yearBornStr;
      
      System.out.print("Please enter your name :");
      name = sc.nextLine();
      System.out.print("Please enter your born date :");
      yearBornStr = sc.nextLine();
      
      yearBorn = Integer.parseInt(yearBornStr);
      age = currentYear - yearBorn;
      
      System.out.println("\n Your Name is " + name);
      System.out.println("\n You Are " + age + " Years Old !.");
     
    }
    
}
