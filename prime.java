import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number to check prime or not");
        int num = s.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime no");

        } else {
            System.out.println("not a prime no");
        }

    }
}
