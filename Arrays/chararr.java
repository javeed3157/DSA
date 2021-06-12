import java.util.Scanner;

public class chararr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char arr[]=new char[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.next().charAt(0);
        }
        sc.close();
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        for(char i:arr){
            System.out.println(i);
        }
    }
}