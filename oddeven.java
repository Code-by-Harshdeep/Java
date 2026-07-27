import java.util.Scanner;

class oddeven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to check odd or even");
        int num;
        num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}