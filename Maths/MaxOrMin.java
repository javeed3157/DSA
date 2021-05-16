import java.util.Scanner;
public class MaxOrMin {
    public static void minmax(int i,int j,int k){
        if(i>j && i>k){
            System.out.println(i);
        }
        else if(j>k){
            System.out.println(j);
        }
        else{
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        minmax(a,b,c);
        sc.close();
    }
}
