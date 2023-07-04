public class Estimate {
    // Global Constants
    public int LABOR_RATE = 55;
    public float TRAVEL_COST = 14.77f;

    // Instance Variables
    private String jobName;

    private float materialCost;

    private int laborHours;

    private int travelHours;

    // Constructors
    // Default Constructor
    Estimate() {
        this.jobName = "Sample";
        this.materialCost = 500.00f;
        this.laborHours = 1;
        this.travelHours = 1;
    }

    Estimate(String jobName, float materialCost, int laborHours, int travelHours) {

    }

    Estimate(String jobName, float materialCost) {
        setLaborHours(8);
        setTravelHours(2);
    }

    Estimate(String jobName, float materialCost, int laborHours) {
        setTravelHours(1);
    }

    // Accessor Methods
    public String getJobName() {
        return jobName;
    }

    public float getMaterialCost() {
        return materialCost;
    }

    public int getLaborHours() {
        return laborHours;
    }

    public int getTravelHours() {
        return travelHours;
    }

    // Mutator Methods
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setMaterialCost(float materialCost) {
        this.materialCost = materialCost;
    }

    public void setLaborHours(int laborHours) {
        this.laborHours = laborHours;
    }

    public void setTravelHours(int travelHours) {
        this.travelHours = travelHours;
    }

    public float laborCost(int laborHours) {
        float laborCost = laborHours * LABOR_RATE;
        return laborCost;
    }

    public float travelCost(int travelHours) {
        float travelCost = travelHours * TRAVEL_COST;
        return travelCost;
    }

    public float totalEstimate(float laborCost, float travelCost, float materialCost) {
        float totalEstimate = materialCost + laborCost + travelCost;
        return totalEstimate;
    }

    public static void output(String jobName, float materialCost, int laborHours, int travelHours, float totalEstimate,
                                float laborCost, float travelCost) {
        System.out.println("Entered Name: " + jobName);
        System.out.printf("$ %,.2f%n", materialCost);
        System.out.println("Labor Hours: " + laborHours);
        System.out.println("Travel Hours: " + travelHours);
        System.out.printf("$ %,.2f%n", laborCost);
        System.out.printf("$ %,.2f%n", travelCost);
        System.out.printf("$ %,.2f%n", totalEstimate);
    }
}
