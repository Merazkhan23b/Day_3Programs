import java.util.Scanner;

public class NaturalNumberSum {

    public static void sumOfNaturalNumbers(int n) {
        int i = 1;
        int sum = 0;
        
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        
        sumOfNaturalNumbers(n);
        
        scanner.close();
    }
}