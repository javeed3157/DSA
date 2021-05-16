import java.util.Scanner;

public class AlphabetOrNot {
    public static boolean alp(char sr){
        if((sr<='Z' && sr>='A') || (sr<='z' && sr>='a' )){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(alp(c)){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not an Alphabet");
        }
        sc.close();
    }
}
