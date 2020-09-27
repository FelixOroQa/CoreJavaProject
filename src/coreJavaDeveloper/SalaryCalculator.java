// Create a variable to define our career
//Declare a Variable
// Compute Annual Salary
// Rate * Hour_Per_Week * Weeks_Per_Year


package coreJavaDeveloper;

public class SalaryCalculator {
    public static void main(String[] args){// Create a variable to define our career

        //Declare a Variable
        String career;
        System.out.println("Program is starting");

        //Defined a Variable
        career = "Software Developer";
        System.out.println("My Career is: " + career);

        //Declare & Define
        int hoursPerWeek = 35;
        int weeksPerYear = 50;
        double rate = 70.50;

        career = "Web Developer";// Redefine Variables

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My Salary as a " + career + "at the rate of $ " + rate + "per hour is $" + salary + " per year.");

        // This program will give suggestion of what to wear based on the weather temperature
        int tempterature = 15;

        if (tempterature > 30){
            System.out.println("It's clement; wear shorts and teashiirt");
        }
        else if (tempterature > 25){
            System.out.println("It's a bit cooler, perhaps wear long-sleeve shirt and jeans.");
        }
        else{
            System.out.println("Looks like a cold day; bring a sweater");
        }




// Compute Annual Salary
// Rate * Hour_Per_Week * Weeks_Per_Year

    }

}
/*
* Variables
* Conditional logic: if then blocks
* Functions: return types & arguments*/