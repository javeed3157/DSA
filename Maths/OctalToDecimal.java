import java.util.Scanner;
public class OctalToDecimal {
    public static int otd(int num){
        int sum=0;
        int count=0;
        while(num>0){
            int temp=num%10;
            sum+=temp*Math.pow(8,count);
            count+=1;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(otd(n));
        sc.close();
    }
}
