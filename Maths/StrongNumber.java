import java.util.Scanner;
public class StrongNumber {
    public static int fact(int num) {
        int a=1;
        for(int i=2;i<=num;i++){
            a*=i;
        }
        return a;
    }
    public static boolean strg(int num){
        int sum=0;
        int c=num;
        while(num>0){
            int temp=num%10;
            sum+=fact(temp);
            num/=10;
        }
        if(sum==c){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(strg(n)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
            sc.close();
    }
}