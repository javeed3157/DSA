import java.util.Scanner;
public class ArmstrongOrNot {
    public static boolean arm(int num){
        int sum=0;
        int c=num;
        while(num>0){
            int temp=num%10;
            sum+=temp*temp*temp;
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
        if(arm(n)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
            sc.close();
    }
}
