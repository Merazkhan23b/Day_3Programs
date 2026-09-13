import java.util.Scanner;

public class AtmPinRetrySystem {

    public static void atmPinRetry(String correctPin, String[] attempts) {
        int count = 0;
        boolean isSuccess = false;

        while (count < attempts.length && !isSuccess) {
            if (attempts[count].equals(correctPin)) {
                isSuccess = true;
                System.out.println("PIN accepted");
                break;
            }
            count++;
        }

        if (!isSuccess) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter correct PIN: ");
        String correctPin = scanner.nextLine();

        System.out.print("Enter number of attempts (up to 3): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] attempts = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = scanner.nextLine();
        }

        atmPinRetry(correctPin, attempts);

        scanner.close();
    }
}