import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i) && i>1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
