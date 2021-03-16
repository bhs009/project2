package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Class that holds objects for the class AddressEntry
 * Contains the methods for operations of AddressEntry
 * collection such as add, remove, readFromFile, list, find, and
 * getAddressEntry
 *
 * @author Brian Siu
 */
public class AddressBook {
    //private member variable
    private ArrayList<AddressEntry> a_entry = new ArrayList<>();


    /**
     * Method to loop through the addressEntryList and display
     * contents as a string.
     */
    public void list() {
        for (int i = 1; i <= a_entry.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(a_entry.get(i - 1).toString());
        }
    }
    /**
     * Method to add an AddressEntry object into our AddressBook array
     * @param entry an AddressEntry object
     */
    public void add(AddressEntry entry) {
       a_entry.add(entry);
    }

    /**
     * Method to remove an entry AddressEntry array object
     * @param entry an AddressEntry object
     */
    public void remove(AddressEntry entry) {
        a_entry.remove(entry);
    }

    /**
     * Method to find a number of entries in our AddressBook array by lastName and returns the
     * results
     * @param l_Name a String that indicates the start of a person's last name in our
     *                         AddressBook array
     * @return the AddressEntry object(s) which contains lastName === l_Name
     */
    public ArrayList<AddressEntry> find(String l_Name) {
        ArrayList<AddressEntry> found_list = new ArrayList<>();

        for (int i = 0; i < a_entry.size(); i++) {
            if (a_entry.get(i).getLastName().contains(l_Name)) {
                found_list.add(a_entry.get(i));
            }
        }

        return found_list;
    }

    /**
     * Method to retrieve the AddressBook array
     * @return the AddressBook array
     */
    public ArrayList<AddressEntry> getAddressEntryList() {
        return a_entry;
    }
    /**
     * Method that reads data from a file and creates an AddressEntry object to add
     * the object to our AddressBook array
     * @param path a String to indicate the location of the file to be read
     */
    public void readFromFile(String path) {
        try {
            ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get(path)));

            for (String info: list) {
                AddressEntry entry = new AddressEntry();
                ArrayList<String> entryList = new ArrayList<>(Arrays.asList(info.split(",")));
                entry.setFirstName(entryList.get(0).trim());
                entry.setLastName(entryList.get(1).trim());
                entry.setStreet(entryList.get(2).trim());
                entry.setCity(entryList.get(3).trim());
                entry.setState(entryList.get(4).trim());
                entry.setZip(Integer.parseInt(entryList.get(5).trim()));
                entry.setPhone(entryList.get(6).trim());
                entry.setEmail(entryList.get(7).trim());
                add(entry);
            }

            System.out.println("Read in " + list.size() + " new Addresses");
            System.out.println("There are currently " + a_entry.size() + " Addresses in the Address Book.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
