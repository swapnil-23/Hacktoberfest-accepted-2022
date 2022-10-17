import java.util.Scanner;

public class Practice {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter to check the number is palindrome or not: ");
        int num = in.nextInt();

        int reversum = 0, remainder;

        int originalnum = num;

        while(num!=0)
        {
            remainder = num%10;
            reversum = reversum*10+remainder;
            num /= 10;
        }

        // to check if the number is palindrome or not
        if(reversum == originalnum)
        {
            System.out.println(originalnum +" is palindrome");
        }
        else {
            System.out.println(originalnum+" is not palindrome");
        }
    }
}