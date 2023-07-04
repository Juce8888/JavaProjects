import javax.swing.*;
import java.awt.*;

public class Unit2Notes {
    public static void main(String[] args) {

        // Math
        // Preforming Arithmetic Using Variables adn Constants

        int firstNum = 2;
        int lastNum = 8;
        //Constants
        //Name is all capitalized
        //Page 50

        final float TAX_RATE = 0.015f;
        //final String INDIAN_HILLS_COMMUNITY_COLLEGE = "Indian Hills Community College";
        //System.out.println(INDIAN_HILLS_COMMUNITY_COLLEGE);
        //float number = firstNum + TAX_RATE * 4 - lastNum;

        // Implicit type casting
        // Smaller data types can fit into larger data types automatically

        //byte smallNum = 5;
        //int number2 = smallNum;

        // Explicit type casting
        // Bigger data type to a smaller data type must be manually cast

        int number3 = (int) 5.25;

        //double total = (TAX_RATE + 1) * 15.37;

        //total = Math.floor(total * 100) / 100;

        //System.out.println(number);
        //System.out.println(total);
        //System.out.printf("%,.2f", total);


        // Variable Scope
        // Where you declare a variable
        // Changes where it can be accessed from

        int value = displayValue();
        //System.out.println(value);

        // Parse method example
        String theNumberTwo = "2";
        int total = Integer.parseInt(theNumberTwo) + 2;
        System.out.println(total);
        // Parse methods allow you to convert strings and
        // Vice versa

        // You can use JOptionPane to accept user input in a GUI
        // GUI is a Graphic User Interface
        // Chapter 2 somewhere in the old book
        String purchasePrice = JOptionPane.showInputDialog("Enter your purchase price: ");
        // Check if purchasePrice is actually a number
        // If not, prompt the user again with message saying --- response

        double totalPrice = (TAX_RATE *1) * Double.parseDouble(purchasePrice);
        JOptionPane.showMessageDialog(null, purchasePrice);

    }

    // This can go either way
    // It could go from the main to the other methods

    public static int displayValue() {
        int value = 2;
        // This variable ONLY has scope in this method

        return value;
    }
}
