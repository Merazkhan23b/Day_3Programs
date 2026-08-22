import java.util.Scanner;
public class L5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        
        int origNumber = number;
        int sum=0;
        while(number > 0)
        {
            int digit = number % 10;
            sum = sum + (digit*digit*digit);
            number = number / 10;
        } 
        if(origNumber == sum)
        {
            System.out.println("Is the Number "+origNumber+" a Armstrong? Yes");
        }
        else{
            System.out.println("Is the Number "+origNumber+" a Armstrong? No");
        }
    }
}