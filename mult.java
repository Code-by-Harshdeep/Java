import java.util.Scanner;
public class mult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number check it multplication table");
        int num=sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(num*i);
        }
    }
}
