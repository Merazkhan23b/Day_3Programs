import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void generateFirstValidTable(int[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] < 1) {
                System.out.print("Skipping invalid number: " + candidates[i] + " ");
                continue;
            }
            
            for (int j = 1; j <= 10; j++) {
                System.out.print(candidates[i] + " x " + j + " = " + (candidates[i] * j));
                if (j < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of candidate values: ");
        int n = scanner.nextInt();
        
        int[] candidates = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate " + (i + 1) + ": ");
            candidates[i] = scanner.nextInt();
        }
        
        generateFirstValidTable(candidates);
        
        scanner.close();
    }
}