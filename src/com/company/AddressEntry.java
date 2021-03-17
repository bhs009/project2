package com.company;

/**
 * Class that contains object with variables firstname, lastname, street, city, state, phone and email
 * @author Brian Siu
 */
public class AddressEntry {
    String firstName, lastName, street, city, state, phone, email;
    int zip;

    AddressEntry() {

    }
    AddressEntry(String firstName, String lastName, String street, String city,String state, int zip, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.state = state;
        this.zip = zip;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }



    /**
     * Method to override toString
     * @return a String containing details of a single AddressEntry
     */
    @Override //over ride to string
    public String toString(){
        return firstName + " " + lastName + "\n" + street + "\n" + city +"\n"+state+"\n"
                +zip+"\n"+email+"\n"+phone+"\n";
        //return null;
    }


    /**
     * Method to retrieve first name of an Address Entry object
     * @return a String of an AddressEntry's first name
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * Method to set last name of an Address Entry object
     * @param lastname a String of a person's last name
     */
    public void setLastName(String lastname){
        this.lastName = lastname;
    }
    /**
     * Method to retrieve last name of an Address Entry object
     * @return a String of an AddressEntry's last name
     */
    public String getLastName(){
        return firstName;
    }

    /**
     * Method to set first name of an Address Entry object
     * @param firstName a String of a person's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCity(String city){
        this.city = city;
    }
    /**
     * Method to retrieve city name of an Address Entry object
     * @return a String of an AddressEntry's city name
     */
    public String getCity(){
        return this.city;
    }
    public void setStreet(String s){
        street = s;
    }
    public String getStreet(){
        return street;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getZip() {
        return zip;
    }
    /**
     * Method to retrieve state of an Address Entry object
     * @return a String of an AddressEntry's state value
     */
    public String getState() {
        return state;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Method to set state of an Address Entry object
     * @param state a String containing state value
     */
    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
