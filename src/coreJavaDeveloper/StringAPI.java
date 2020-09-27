package coreJavaDeveloper;

import java.sql.SQLOutput;

public class StringAPI {
    public static void main(String[] args){
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lord of the Rings";
        System.out.println();
        if (bookTitle.contains("Ring")){//this expression contains a boolean-- it returns a true/false
            System.out.println("The Book Contains the Word Ring");
            System.out.println("The book contains the word: " + wordChoice);
        }
        String browser = "Chrome";
        //(browser == "chrome")
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The Browser is Chrome " + "Browser!!!");
        }
        String firstName = "Felix";
        String middleName = "Ebiye";
        String lastName = "Oro";
        String NINo = "ST474497B";

        System.out.println("There are " + NINo.length() + " digits in your NINo");

        //Print the initials plus the last 4 digits NINo
        System.out.println(firstName.substring(0,3));
        System.out.println(middleName.substring(0,3));
        System.out.println(lastName.substring(0,3));
        System.out.println(NINo.substring(0,9));
    }
}
