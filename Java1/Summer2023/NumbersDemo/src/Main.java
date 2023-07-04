import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number: ");
        int secondNumber = scanner.nextInt();

        displayTwiceTheNumber(firstNumber, secondNumber);
        displayTwiceTheNumber(firstNumber);
        displayTwiceTheNumber(secondNumber);
    }


    private static void displayTwiceTheNumber(int number) {
        System.out.println(number * 2);
    }

    private static void displayTwiceTheNumber(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * 2 + "" + secondNumber * 2);
    }
}
