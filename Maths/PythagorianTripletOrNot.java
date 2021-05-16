import java.util.Scanner;

public class PythagorianTripletOrNot {
    public static boolean pytr(int a1,int a2,int a3){
        int x=Math.max(a1,Math.max(a2,a3));
        int y,z;
        if(x==a1){
            y=a2;
            z=a3;
        }
        else if(x==a2){
            y=a1;
            z=a3;
        }
        else{
            y=a1;
            z=a2;
        }
        if(x*x==y*y+z*z){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(pytr(a,b,c)){
        System.out.println("Pythagorian Triplet");
    }
    else{
        System.out.println("Not Pythagorian Triplet");
    }
    sc.close();
    }
}
