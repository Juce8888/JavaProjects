import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.floor(10 * Math.random()));

        Car toyotaCorolla = new Car();
        Car toyotaRav4 = new Car();

        toyotaCorolla.setColor("Blue");
        toyotaRav4.setColor("Green");

        System.out.println(toyotaCorolla.getColor());
        System.out.println(toyotaRav4.getColor());

        Scanner scannerInput = new Scanner(System.in);
        String userInput = scannerInput.nextLine();
        System.out.println(userInput);
        }
    }
