import java.util.Scanner;
public class L3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        int origNumber = number;
        int reversedNumber=0;

        while(number > 0)
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        if(origNumber == reversedNumber)
        {
            System.out.println("Is the Number "+origNumber+" a Palindrome? Yes");
        }
        else
        {
            System.out.println("Is the Number "+origNumber+" a Palindrome? No");
        }
    }
}