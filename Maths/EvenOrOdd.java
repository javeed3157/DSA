import java.util.Scanner;
public class EvenOrOdd {
    public static boolean eo(int num){
        if((num&1)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(eo(n)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
