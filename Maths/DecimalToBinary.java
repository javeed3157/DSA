import java.util.Scanner;
public class DecimalToBinary{
    public static int dtb(int num){
        int x=1;
        int ans=0;
        while(x<=num){
            x*=2;
        }
        x/=2;
        while(x>0){
            int ld=num/x;
            num-=ld*x;
            x/=2;
            ans=ans*10+ld;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(dtb(n));
        sc.close();
    }
}