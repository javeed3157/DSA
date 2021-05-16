import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int num){
        int f1=0;
        int f2=1;
        int f3;
        if(num==0){
            // return 0;
            System.out.println(0);
        }
        else if(num==1){
            // return 1;
            System.out.println(1);
        }
        else{
            for(int i=1;i<=num;i++){
                // return f1;
                System.out.println(f1);
                f3=f1+f2;
                f1=f2;
                f2=f3;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(fibo(b(n)));
        fibo(n);
        sc.close();
    }
}
