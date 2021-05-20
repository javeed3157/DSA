import java.util.Scanner;
//Time:O(n)
//Space:O(1)
public class LinearSearch {
    public static int ls(int ar[],int num,int key){
        for(int i=0;i<num;i++){
            if(ar[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(ls(arr,n,k));
        sc.close();
    }
}
