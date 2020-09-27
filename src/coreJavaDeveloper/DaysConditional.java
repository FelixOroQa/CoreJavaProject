/*
* You can control the program based onthe value of the variables */


package coreJavaDeveloper;

public class DaysConditional {

    public static void main(String[] args){
        // Execute different blocks of code based on the value of a condition

        String dayOfWeek = "Tuesday";

        switch (dayOfWeek){
            case "Monday" :
                System.out.println("Today is Monday");
            case "Tuesday" :
                System.out.println("Today is Tuesday");
            case "Wednesday" :
                System.out.println("Today is Wednesday");
            case "Thursday" :
                System.out.println("Today is Thursday");
                break;
            case "Friday" :
                System.out.println("Today is Friday");
            case "Saturday" :
                System.out.println("Today is Saturday");
                break;
            case "Sunday" :
                System.out.println("Today is Sunday");
        }
    }
}
