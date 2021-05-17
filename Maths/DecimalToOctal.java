import java.util.Scanner;
public class DecimalToOctal {
    public static int dto(int num){
        int x=1;
        int ans=0;
        while(x<=num){
            x*=8;
        }
        x/=8;
        while(x>0){
            int ld=num/x;
            num-=ld*x;
            x/=8;
            ans=ans*10+ld;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(dto(n));
        sc.close();
    }
}
