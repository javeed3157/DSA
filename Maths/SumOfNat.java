import java.util.Scanner;
public class SumOfNat {
    public static int nat(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
        // return (num*(num+1)/2); //This is one liner 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nat(n));
        sc.close();
    }
}
