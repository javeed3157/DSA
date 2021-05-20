import java.util.Scanner;
//Time:O(logn)
//Space:O(logn)
public class BinarySearchRecursive {
    public static int bsr(int ar[],int num,int key,int st,int en){
        if(st>en){
            return -1;
        }
        int mid=(st+en)/2;
        if(ar[mid]==key){
            return mid;
        }
        if(ar[mid]>key){
            return bsr(ar,num,key,st,mid-1);
        }
        else{
            return bsr(ar,num,key,mid+1,en);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int e=n-1;
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(bsr(arr,n,k,s,e));
        sc.close();
    }
}
