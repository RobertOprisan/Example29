import java.util.Scanner;
public class Example29 {
    public static void main(String[] args) {
        int dividend, divisor;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend");
        dividend = input.nextInt();

        System.out.println("Enter divisor");
        divisor = input.nextInt();

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count = count +1;
        }
        System.out.println("Reminder = " + dividend);
        System.out.println("Count = " + count);
    }
}




