//sout + Tabs = System.out.println();
package coreJavaDeveloper;


public class LoopsDoWhileFor {
    public static void main(String[] args){

        String[] countries; //Declare Array
        countries = new String[7]; //Define the Array
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Australia";
        countries[3] = "England";
        countries[4] = "Switzerland";
        countries[5] = "Italy";
        countries[6] = "Germany";
        int i = 0;

        //Do Loop: enters the loop and then tests the condition
        do {
            System.out.println("Country: " + countries[i]);
            i = i + 1;
        } while (i < 7 );

        // While Loop tests condition first and then enters the loop
        int n = 0;
        boolean countryFound = false;
        while (!countryFound) {
            String country = countries[n];
            System.out.println(country);

            if (country == "Italy"){
                System.out.println("Country Found");
                countryFound = true;
            }
            System.out.println("Country: " + n + ": " + countries[n]);
            n++;
        }
        System.out.println("\nPRINTING WITH FOR LOOPS");//      use " \n " to give another line-break
        //For Loops: the best structure for iterating through an Array
        for (int x = 0; x <5; x++){
            System.out.println(countries[x]);
        }




//        int [] digits = {1, 2, 3, 4, 5, 6 };
//        //int[] digits = new int[2];
//        digits[0] =1;
//        digits[1]= 2;
//        System.out.println(digits.length);

       // System.out.println(Arrays.toString(digits));
    }
}



//    int i = 0;
//
////Do Loop enters the loop and then tests the condition
//        do {
//                System.out.println("Country: " + countries[i]);
//                i = i + 1;
//
//                } while (i < 6 );
//        // While Loop tests condition first and then enters the loop
//        int n = 0;
//        while (n <= 5) {
//        System.out.println("Country: " + n + ": " + countries[n]);
//        //n++;
//        }