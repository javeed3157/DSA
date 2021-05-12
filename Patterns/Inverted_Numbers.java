import java.util.Scanner;
public class Inverted_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=i;j<=n;j++){
                System.out.print(k+" ");
                k+=1;
            }
            // for(int j=1;j<=n+1-i;j++){
            //     System.out.print(j+" ");
            // }
            System.out.println();
        }
        sc.close();
    }
}
