import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id = userInput();
        boolean isAuthorized = isAuthorized(id);
        idCheck(id, isAuthorized);

    }

    public static boolean isAuthorized(String userId) {

        return userId.equals("1234");
    }

    public static String userInput(){
        System.out.println("Enter a user ID: ");
        Scanner scanner = new Scanner(System.in);
        String userId = scanner.nextLine();
        return userId;
    }

    public static void idCheck(String userId, boolean approved) {
       System.out.println("User ID: " + userId);
       System.out.println("Is user authorized: " + approved);
    }

}
