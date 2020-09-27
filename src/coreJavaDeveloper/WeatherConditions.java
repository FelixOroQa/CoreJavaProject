package coreJavaDeveloper;

public class WeatherConditions {
    public static void main(String[] args){
        // This program will give suggestion of what to wear based on the weather (temperature & sunny condition)

        int tempterature = 15;
        //String sunCondition = "Sunny";
        String sunCondition = "Overcast";

        if (tempterature > 30){
            System.out.println("It's clement; wear shorts and teashiirt");
        }
        else if ((tempterature > 25) && (sunCondition == "Sunny")){
            System.out.println("It's a bit cooler, perhaps wear long-sleeve shirt and jeans.");
            System.out.println("Wear a hat to keep the sun out of your eyes.");
        }
        else if ((tempterature > 37) || (sunCondition == "Overcast")){
            System.out.println("This is a cool day, make sure to wear warm clothes");
        }
        else{
            System.out.println("Looks like a cold day; bring a sweater");
        }

        System.out.println("The Program is Complete and Ending");
    }
}
