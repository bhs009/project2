package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that contains the main method to run the Address Book application.
 * This class creates a single AddressBook instance that is used throughout the
 * life of the application
 *
 * @author Brian Siu
 */
public class AddressBookApplication {
    /**
     * Main method to run the Address Book application
     * @param args an array of String(s)
     */
    public static void main(String[] args) {
	// write your code here
/*
        Menu.prompt_FirstName();
        Menu.prompt_LastName();
       // String first_name = Menu.prompt_FirstName();
        Menu.prompt_Street();
        Menu.prompt_City();
        Menu.prompt_State();
        Menu.prompt_Zip();
        Menu.prompt_Telephone();
        Menu.prompt_Email();
        */
        //start
        AddressBook ad_book = new AddressBook();

        //prompt menu
        char choices = Menu.prompt_Menu(System.in);

        //loop for going through choices
        while (choices != 'q') {
            switch(choices) {
                case 'a':
                    readFromFile(ad_book);
                    break;
                case 'b':
                    addEntry(ad_book);
                    break;
                case 'c':
                    removeEntry(ad_book);
                    break;
                case 'd':
                    findEntry(ad_book);
                    break;
                case 'e':
                    ad_book.list();
                    break;
                default:
                    System.out.println("Not a valid choice, valid choices are a, b, c, d, e, q.\n");
                    break;
            }

            choices = Menu.prompt_Menu(System.in);
        }

        if (choices == 'q') {
            System.out.println("Goodbye!");
        }

    }

    /**
     * Method to read in strings from a file
     * @param a_b an AddressBook instance
     */
    private static void readFromFile(AddressBook a_b) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in filename:");
        a_b.readFromFile(input.nextLine());
    }

    /**
     * Method to find a user by last name
     * @param a_b an AddressBook instance
     */
    private static void findEntry(AddressBook a_b) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter last name :");
        System.out.print("\n ");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = a_b.find(lastName);

        if (result.size() > 0) {
            System.out.println("There are " + result.size() + " found in the address book for last names starting with " + lastName);
            for (int i = 0; i < result.size(); i++) {
                System.out.println(i+1 + " : " + result.get(i).toString());
            }
        } else {
            System.out.println("No names with " + lastName + " found.");
        }
    }

    /**
     * Method to remove an entry in an AddressBook by last name
     * @param a_b an AddressBook instance
     */
    private static void removeEntry(AddressBook a_b) {
        Scanner input = new Scanner(System.in);
        int choice;
        char isRemove;
        System.out.println("Enter in Last Name of contact to remove:");

        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = a_b.find(lastName);

        if (result.size() <= 0) {
            System.out.println("No entries found");
            return;
        }

        System.out.println("There are " + result.size() + " entries found in the address book");
        System.out.println("Remove which entry number :");

        for (int i = 1; i <= result.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(result.get(i-1));
        }

       choice = Integer.parseInt(input.nextLine());

        while (choice <= 0 || choice > result.size()) {
            System.out.println("Choice not valid, try again");

            choice = Integer.parseInt(input.nextLine());
        };

        System.out.println("Press y to confirm removal or n to return to main menu:");
        System.out.println(result.get(choice -1));

        isRemove = input.next().charAt(0);

        if (isRemove == 'y') {
            AddressEntry contact = result.get(choice -1);
            a_b.remove(contact);
            System.out.println("Removed " + contact.getFirstName() + " " + contact.getLastName() + " contact");
        }
    }

    /**
     * Method to prompt user for a single AddressEntry detail and adds to
     * our AddressBook instance
     * @param a_b an AddressBook instance
     */
    private static void addEntry(AddressBook a_b) {
        AddressEntry entry = new AddressEntry();
        String firstName;
        String lastName;
        String street;
        String city;
        String state;
        int zip;
        String phone;
        String email;

        firstName = Menu.prompt_FirstName(System.in);
        entry.setFirstName(firstName);

        lastName = Menu.prompt_LastName(System.in);
        entry.setLastName(lastName);

        street = Menu.prompt_Street(System.in);
        entry.setStreet(street);

        city = Menu.prompt_City(System.in);
        entry.setCity(city);

        state = Menu.prompt_State(System.in);
        entry.setState(state);

        zip = Menu.prompt_Zip(System.in);
        entry.setZip(zip);

        phone = Menu.prompt_Telephone(System.in);
        entry.setPhone(phone);

        email = Menu.prompt_Email(System.in);
        entry.setEmail(email);

        a_b.add(entry);

        System.out.println("Added : \n");
        System.out.println(entry.toString());
    }
}
