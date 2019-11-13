package Programm;
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Scanner;

public class Random_Number extends Application{
    public static void main (String args[])
    {

        int attempts = 5;
        System.out.println("Hello, guess the number from 0 to 10.");
        System.out.println("You have "+ attempts + " attempts!");
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        Scanner scanNumber = new Scanner(System.in);
        int j;
        for ( j=0; j<5 ;){

        int myNumber = scanNumber.nextInt();
        System.out.println("Your number is: "+ myNumber);

        if (randomNumber == myNumber)
        {
            System.out.println("****************************************");
            System.out.println("***                                  ***");
            System.out.println("***                                  ***");
            System.out.println("***     Congratulations: "+ randomNumber + " = " + myNumber+"       ***");
            System.out.println("***                                  ***");
            System.out.println("***                                  ***");
            System.out.println("****************************************");
            j=6;
        }
        else if (randomNumber > myNumber && j != 5)
        {
            System.out.println("HIGHER");
            System.out.println("You have "+ (--attempts)+ " attempts");
            j++;
        }
        else if (randomNumber < myNumber && j != 5)
        {
            System.out.println("LOWER");
            System.out.println("You have "+ (--attempts));
            j++;
        }
        }
        if (j == 5) {
            System.out.println("************************");
            System.out.println("***                  ***");
            System.out.println("***                  ***");
            System.out.println("***   GAME OVER !!!  ***");
            System.out.println("***                  ***");
            System.out.println("***                  ***");
            System.out.println("************************");
        }

    }

    @Override
    public void start(Stage primaryStage){

    }
}
