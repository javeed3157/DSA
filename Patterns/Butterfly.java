import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            int k=2*n-2*i;
            for(int j=1;j<=k;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            int k=2*n-2*i;
            for(int j=1;j<=k;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
