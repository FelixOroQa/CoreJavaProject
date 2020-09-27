/*
* Arrays are ordered sets of data of like-types
* */

package coreJavaDeveloper;

public class Arrays {
    public static void main(String[] args){
        // Declare and Define an Array  (Implicitly defining the size)
        String[] cities = {"New York", "London", "Paris", "Prague"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        //Declare the Array (Explicitly defining only the size)
        String[] states = new String[5];
        states[0] = "Rome";
        states[1] = "Greece";
        states[2] = "Monaco";
        states[3] = "Iran";
        states[4] = "Dubai";
        System.out.println(states[3]);

        //Declare Array
        String[] countries;
        //Define the Array
        countries = new String[7];
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Australia";
        countries[3] = "England";
        countries[4] = "Switzerland";
        countries[5] = "Italy";
        countries[6] = "Germany";
        System.out.println(countries[6]);

    }
}
