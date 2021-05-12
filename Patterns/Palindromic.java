import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            int k=i;
            for(int j=(n-i);j<n;j++){
                System.out.print(k--+" ");
            }
            k=2;
            for(int j=n;j<n+i-1;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
