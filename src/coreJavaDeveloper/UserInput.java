

package coreJavaDeveloper;

import java.util.Date;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Date now = new Date();//reference type  -- an object is the instance of the date class

        Scanner input = new Scanner(System.in);// user input

        System.out.print("Enter your age in years: ");
        int ageInYears = input.nextInt();
        int ageInDays = ageInYears * 365;
//        System.out.println("You are about " + ageInDays + " days old. ");
        System.out.print("That is about ");
        System.out.println(ageInDays);
        System.out.println(" ageInDays. ");

    }
}
