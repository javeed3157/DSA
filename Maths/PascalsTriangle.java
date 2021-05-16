import java.util.Scanner;
public class PascalsTriangle {
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
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
