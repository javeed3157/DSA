import java.util.Scanner;

public class Half_Pyramid_After_180deg_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                System.out.print("  ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
