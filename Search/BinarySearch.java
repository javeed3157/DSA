import java.util.Scanner;
//Time:O(logn)
//Space:O(1)
public class BinarySearch {
    public static int bs(int ar[],int num,int key){
        int s=0;int e=num-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(ar[mid]==key){
                return mid;
            }
            else if(ar[mid]>key){
                e=mid-1;
            }
            else{
                s=mid+1;
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
        System.out.println(bs(arr,n,k));
        sc.close();
    }
}
