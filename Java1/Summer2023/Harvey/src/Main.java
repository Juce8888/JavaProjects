import java.util.Scanner;

// This program is made to give a price for how much the home repair project will cost
// Kele Allison 6/27/23
public class Main {
    public static void main(String[] args) {
        String jobInput = jobName();
        float materialInput = materialCost();
        int laborInput = laborHours();
        int travelInput = travelHours();
        Estimate repairProject1 = new Estimate(jobInput, materialInput, laborInput, travelInput);
        float laborCost = repairProject1.laborCost(laborInput);
        float travelCost = repairProject1.travelCost(travelInput);
        float totalEstimate = repairProject1.totalEstimate(laborInput, travelInput, materialInput);
        System.out.println(Estimate.output(jobInput, materialInput, laborInput, travelInput,
                laborCost, travelCost, totalEstimate));
    }

    public static int travelHours() {
        System.out.println("Enter Hours Traveled: ");
        Scanner travelHours = new Scanner(System.in);
        int travelInput = travelHours.nextInt();
        return travelInput;
    }

    public static int laborHours() {
        System.out.println("Enter Labor Hours: ");
        Scanner laborHours = new Scanner(System.in);
        int laborInput = laborHours.nextInt();
        return laborInput;
    }

    public static float materialCost() {
        System.out.println("Enter Cost of Materials: ");
        Scanner materialCost = new Scanner(System.in);
        float materialInput = Float.parseFloat(materialCost.nextLine());
        return materialInput;
    }

    public static String jobName() {
        System.out.println("Enter Job name: ");
        Scanner jobName = new Scanner(System.in);
        String jobInput = jobName.next();
        return jobInput;
    }
}