import java.util.Scanner;

public class Factorial {
    public static int fact(int num) {
        int a=1;
        for(int i=2;i<=num;i++){
            a*=i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
