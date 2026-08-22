import java.util.Scanner;
public class L1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
               isPrime = false;
               break;
            }
            
        }

        if(isPrime)
        {
            System.out.println("Is the Number "+number+" a Prime Number? Yes");
        }
        else
        {
            System.out.println("Is the Number "+number+" a Prime Number? No");
        }
    }
}