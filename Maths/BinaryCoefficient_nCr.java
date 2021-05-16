import java.util.Scanner;

public class BinaryCoefficient_nCr{
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
        int r=sc.nextInt();
        int p=fact(n)/(fact(n-r)*fact(r));
        System.out.println(p);
        sc.close();
    }
}