import java.util.Scanner;
class  fact{
        static int fact (int n){
        if(n==0||n==1){
            return 1;
        } else{
            return n*fact(n-1);
        }
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
                System.out.println("enter number to check factorial of a given number");
        int num=s.nextInt();

           System.out.println("factorail is :"+fact(num));
    
}
}