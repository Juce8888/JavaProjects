import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float userInput = inputPurchasePrice();
        float totalCountyTax = cCounty(userInput);
        float totalStateTax = cState(userInput);
        float totalSaleTax = cTax(userInput);
        float totalSale = cTotal(userInput, totalSaleTax);
        output(userInput, totalCountyTax, totalStateTax, totalSaleTax, totalSale);
    }

    public static float cState(float userInput) {
        float totalStateTax = userInput * 0.04f;
        return totalStateTax;
    }

    public static float cCounty(float userInput){
        float totalCountyTax = userInput * 0.02f;
        return totalCountyTax;
    }

    public static void output(float userInput, float totalCountyTax, float totalStateTax,
                              float totalSaleTax, float totalSale) {
        System.out.printf("$ %,.2f%n", userInput);
        System.out.printf("$ %,.2f%n", totalStateTax);
        System.out.printf("$ %,.2f%n", totalCountyTax);
        System.out.printf("$ %,.2f%n", totalSaleTax);
        System.out.printf("$ %,.2f%n", totalSale);
    }

    public static float cTotal(float userInput, float totalTax) {
        float totalPurchase = userInput + totalTax;
        return totalPurchase;
    }

    public static float cTax(float userInput) {
        float stateTaxTotal = userInput * 0.04f;
        float countyTaxTotal = userInput * 0.02f;
        float totalTax = stateTaxTotal + countyTaxTotal;
        return totalTax;
    }

    public static float inputPurchasePrice() {
        System.out.print("Enter Cost of food: ");
        Scanner purchasePrice = new Scanner(System.in);
        float userInput = Float.parseFloat(purchasePrice.nextLine());
        return userInput;
    }
}
