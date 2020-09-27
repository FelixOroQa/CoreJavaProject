//In OOP, we create instances of classes
//Class - contains everything & has members--- blueprint or factory that creates
//Methods - do something or perform action
//Statements - Telling the computer somthing
//Properties - store something
//Access modifier (eg. public, private) - who can see or access this class
//Static - no instance of Class is needed
//Object - Instance of a Class

package coreJavaDeveloper;

import java.util.Date;
import java.util.Scanner;

public class MyFoundation {
    public static void main(String[] args){

        //user input
        Scanner input = new Scanner(System.in);

        byte age = 50;//primitive type
        Date now = new Date();//reference type  -- an object is the instance of the date class
        System.out.println("New Developer");
        System.out.println(5*5);
            int years = 21;
            int days = years * 365;
            System.out.println("You are about " + days + " days old. ");

//creating an instance of a class
        var x = new MyFoundation(); //creating an object
         x.tacos();
    }
    public void tacos() {//methods
        System.out.println("Welcome Felix");
         }
//         public void age(){
//        int y = 21;
//        int d = y * 365;
//        System.out.println("You are about " + d + " days old. ");
        }








