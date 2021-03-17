package com.company;

import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class to test AddressEntry class
 *
 * @author Brian Siu
 */
public class AddressEntryTest extends TestCase {
    /**
     * 1st test for toString method in AddressEntry
     */
    @Test
    public void testTestToString() {
    }
    /**
     * Test for getFirstName method in AddressEntry
     */
    @Test
    public void testGetFirstName() {
        AddressEntry entry = new AddressEntry("John", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getFirstName(), "John");
    }
    /**
     * Test for setLastName method in AddressEntry
     */
    @Test
    public void testSetLastName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "Doe";
        entry.setLastName(name1);
        assertEquals(entry.getLastName(), name1);
    }
    /**
     * Test for getLastName method in AddressEntry
     */
    @Test
    public void testGetLastName() {
        AddressEntry entry = new AddressEntry("Lex", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getLastName(), "Doe");
    }
    /**
     * Test for setFirstName method in AddressEntry
     */
    @Test
    public void testSetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "John";
        entry.setFirstName(name1);
        assertEquals(entry.getFirstName(), name1);
    }
    /**
     * Test for setCity method
     */
    @Test
    public void testSetCity() {
        AddressEntry entry = new AddressEntry();
        String city1 = "Hayward";
        entry.setCity(city1);
        assertEquals(entry.getCity(), city1);
    }
    /**
     * Test for getCity method
     */
    @Test
    public void testGetCity() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getCity(), "Hayward");
    }
    /**
     * Test for setStreet method
     */
    @Test
    public void testSetStreet() {
        AddressEntry entry = new AddressEntry();
        String street1 = "Main St";
        entry.setStreet(street1);
        assertEquals(entry.getStreet(), street1);
    }
    /**
     * Test for getStreet method
     */
    @Test
    public void testGetStreet() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getStreet(), "Mission Blvd");
    }
    /**
     * Test for getEmail method
     */
    @Test
    public void testGetEmail() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "343-343-2312", "test@test.com");
        assertEquals(entry.getEmail(), "test@test.com");
    }
    /**
     * Test for getPhone method
     */
    @Test
    public void testGetPhone() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getPhone(), "444-444-4444");
    }
    /**
     * Test for getZip method
     */
    @Test
    public void testGetZip() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getZip(), 94544);
    }
    /**
     * test for getState method
     */
    @Test
    public void testGetState() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getState(), "CA");
    }
    /**
     * Test for setEmail method
     */
    @Test
    public void testSetEmail() {
        AddressEntry entry = new AddressEntry();
        String email1 = "test@test.com";
        entry.setEmail(email1);
        assertEquals(entry.getEmail(), email1);
    }
    /**
     * Test for setPhone method
     */
    @Test
    public void testSetPhone() {
        AddressEntry entry = new AddressEntry();
        String phone1 = "510-510-4444";
        entry.setPhone(phone1);
        assertEquals(entry.getPhone(), phone1);
    }
    /**
     * Test for setState method
     */
    @Test
    public void testSetState() {
        AddressEntry entry = new AddressEntry();
        String state1 = "WY";
        entry.setState(state1);
        assertEquals(entry.getState(), state1);
    }
    /**
     * Test for setZip method
     */
    @Test
    public void testSetZip() {
        AddressEntry entry = new AddressEntry();
        int zip1 = 94544;
        entry.setZip(zip1);
        assertEquals(entry.getZip(), zip1);
    }
}