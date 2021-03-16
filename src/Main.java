/**
 * @author Jesus Naranjo
 * @version 14 March 2020
 * */

import java.util.*;

public class Main {


    static double yards3 = 1613.33;//cubic yards per acre
//    static double compost = 270; //amount of compost in cubic feet per acre

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        display();
        storingInfo(s);


    }

    public static void display()
    {
        for (int i = 1; i <= 100; i++) { //loop for symbol
            System.out.print("%");
        }
        System.out.print("\nThis app finds the total amount of each ingredient would be needed for the total area.\n");
        for (int i = 1; i <= 100; i++) { //loop for symbol
            System.out.print("%");
        }
        System.out.println();
    }

    public static void storingInfo(Scanner s)
    {
        System.out.print("What is your name? ");//declaration which displays this output
        String name = s.nextLine();// stores input of user under string type variable named, name
        System.out.print("Hi " + name + " Lets start!!\n");
        System.out.println();

        System.out.println("How many acre's will be used: (can be put in quarter increments)");
        double acre = s.nextDouble();

        double amount = yards3*acre;

        System.out.println("Amount of compost needed for " + acre +" acre is: " + amount + " cubic yards to be stabilized");
    }


    //returns the users input after validating with the below method
    public static String getUserChoice(Scanner kb) {
        String userAnswer;
//        do {
//            System.out.println("your choices");
//            System.out.println("\t\tRock" + "  \n\t\tPaper" + " \n\t\tScissors" + "  \n\t\tstop");
//            System.out.print("Enter your choice: ");
//            userAnswer = kb.nextLine();
//        }while(!isValid(userAnswer));

//        return userAnswer.toUpperCase();
        return "";
    }



}
