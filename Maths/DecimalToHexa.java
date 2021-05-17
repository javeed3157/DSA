import java.util.Scanner;
public class DecimalToHexa {
    public static String dth(int num){
        int x;
        String ans="";
        char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0){
            x=num%16;
            ans+=arr[x];
            num/=16;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(dth(n));
        sc.close();
    }
}
