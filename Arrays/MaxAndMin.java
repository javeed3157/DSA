import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println("Max : "+maxi+" Mini : "+mini);
        sc.close();
    }
}
