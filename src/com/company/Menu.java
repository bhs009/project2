package com.company;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
//class for prompts from driver

/**
*Class that holds the prompts for the interface
 * @author Brian Siu
*/
public class Menu {
    /*
    public static void prompt_FirstName(){
        System.out.println("First Name: ");
    }
    public static void prompt_LastName(){
        System.out.println("Last Name:");
    }
    public static void prompt_Street(){
        System.out.println("Street:");
    }
    public static void prompt_City(){
        System.out.println("City:");
    }
    public static void prompt_State(){
        System.out.println("State:");
    }
    public static void prompt_Zip(){
        System.out.println("Zip:");
    }
    public static void prompt_Telephone(){
        System.out.println("Telepohone:");
    }
    public static void prompt_Email(){
        System.out.println("Email:");
    }
    
     */

    /**
     * Method that prompts user to enter first name
     * @return a String containing first name value
     */
    public static String prompt_FirstName(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("First Name:");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter last name
     * @return a String containing last name value
     */
    public static String prompt_LastName(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Last Name:");
        return input.nextLine();
    }
    /**
     * Method that prompts user to enter street name
     * @return a String containing street name value
     */
    public static String prompt_Street(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Street:");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter city name
     * @return a String containing city name value
     */
    public static String prompt_City(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("City:");
        return input.nextLine();
    }
    /**
     * Method that prompts user to enter state
     * @return a String containing state value
     */
    public static String prompt_State(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("State:");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter zip code
     * @return an int containing zip code value
     */
    public static int prompt_Zip(InputStream in) {
        Scanner input = new Scanner(in);
        String zip;

        System.out.println("Zip : ");
        zip = input.nextLine();
        return Integer.parseInt(zip);
    }

    /**
     * Method that prompts user to enter phone number
     * @return a String containing phone number value
     */
    public static String prompt_Telephone(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Telephone:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter email
     * @return a String containing email value
     */
    public static String prompt_Email(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Email:");
        System.out.print("> ");
        //nothong
        return input.nextLine();
    }


    /**
     * Method to prompt a user to enter a selection from a menu
     * @return a char that contains the user's selected option
     */
    public static char prompt_Menu(InputStream in) {
        Scanner input = new Scanner(in);

        System.out.println("Please enter in your menu selection");
        System.out.println("a) Load from a File");
        System.out.println("b) Add");
        System.out.println("c) Remove");
        System.out.println("d) Find");
        System.out.println("e) List");
        System.out.println("q) Quit");


        return input.nextLine().charAt(0);
    }


}
