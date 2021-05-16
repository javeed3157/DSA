import java.util.Scanner;
public class HexaToDecimal {
    public static int htd(String num){
        int sum=0;
        int count=0;
        int l=num.length();
        for(int i=l-1;i>=0;i--){
            if(num.charAt(i)>='0' && num.charAt(i)<='9'){
                sum+=Math.pow(16,count)*(num.charAt(i)-'0');
            }
            else if(num.charAt(i)>='A' && num.charAt(i)<='F'){
                sum+=Math.pow(16,count)*(num.charAt(i)-'A'+10);
            }
            count+=1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.print(htd(n));
        sc.close();
    }
}
