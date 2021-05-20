// Time:O(logn)
// Space:O(n)
public class Search_Infinite_Sorted_Array {
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
    // public static int bs(int ar[],int num,int key,int s,int e){
    //     while(s<=e){
    //         int mid=(s+e)/2;
    //         if(ar[mid]==key){
    //             return mid;
    //         }
    //         else if(ar[mid]>key){
    //             e=mid-1;
    //         }
    //         else{
    //             s=mid+1;
    //         }
    //     }
    //     return -1;
    // }
    public static int sisa(int ar[],int key){
        int low=0;
        int high=1;
        while(ar[high]<key){
            low=high;
            if(ar.length-1>2*high){
            high=2*high;}
            else{
                high=ar.length-1;
            }
        }
        return bsr(ar,high-low,key,low,high);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int k=19;
        System.out.println(sisa(arr,k));
    }
}
