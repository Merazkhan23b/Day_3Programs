import java.util.Scanner;

public class LoginSimulator {

    public static void simulateLogin(String correctCode, String[] attempts) {
        boolean isGranted = false;
        
        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                isGranted = true;
                break;
            }
        }
        
        if (!isGranted) {
            System.out.println("Access denied — all attempts used");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter correct access code: ");
        String correctCode = scanner.nextLine();
        
        System.out.print("Enter number of attempts to test (up to 3): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        String[] attempts = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = scanner.nextLine();
        }
        
        simulateLogin(correctCode, attempts);
        
        scanner.close();
    }
}