import java.util.Scanner; // Import the Scanner class to read user input

/**
 * Represents the data collected from a simple form.
 * This class holds the values for each field in the form.
 */
class FormData {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;

    /**
     * Constructor to initialize FormData with provided values.
     *
     * @param firstName   The user's first name.
     * @param lastName    The user's last name.
     * @param email       The user's email address.
     * @param phoneNumber The user's phone number.
     * @param address     The user's address.
     */
    public FormData(String firstName, String lastName, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // --- Getter Methods ---
    /**
     * Gets the first name.
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name.
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the email address.
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the phone number.
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the address.
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    // --- Setter Methods (Optional, but good practice for mutable objects) ---
    /**
     * Sets the first name.
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name.
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the email address.
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the phone number.
     * @param phoneNumber The phone number to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the address.
     * @param address The address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Overrides the toString method to provide a structured string representation
     * of the form data.
     * @return A formatted string containing all form field values.
     */
    @Override
    public String toString() {
        return "--- Form Submission Details ---\n" +
               "First Name: " + firstName + "\n" +
               "Last Name:  " + lastName + "\n" +
               "Email:      " + email + "\n" +
               "Phone No.:  " + phoneNumber + "\n" +
               "Address:    " + address + "\n" +
               "-----------------------------";
    }
}

/**
 * Main application class to demonstrate the form.
 * This class handles user input and displays the collected data.
 */
public class SimpleFormApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Welcome to the Simple Java Form Application!");
        System.out.println("Please fill in the following details:");

        // Prompt for each field and read input
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        // Create an instance of the FormData class with the collected input
        FormData submittedForm = new FormData(firstName, lastName, email, phoneNumber, address);

        System.out.println("\nThank you for submitting the form!");
        // Print the collected data using the toString method of FormData
        System.out.println(submittedForm.toString());

        scanner.close(); // Close the scanner to release system resources
    }
}
