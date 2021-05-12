import java.util.Scanner;

public class Zig_Zag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if(((i+j)%4==0) || (i==2 && j%4==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
