//Oracle,Amazon
public class Repeating_Smallest_First_Occurance {
    public static int srsfo(int a[],int n){
        int minind=Integer.MAX_VALUE;
        int ar[]=new int[1000000];
        for(int i=0;i<ar.length;i++){
            ar[i]=-1;
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            if(ar[a[i]] !=-1){
                minind=Math.min(minind,ar[a[i]]);
                found=true;
            }
            else{
                ar[a[i]]=i;
            }
        }
        if(found==false){
            return -1;
        }
        return minind+1;
        //Through Brute Force
    //     boolean found=false;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(a[i]==a[j]){
    //                 minind=Math.min(minind,i);
    //                 found=true;
    //             }
    //         }
    //     }
    //     if(found==false){
    //         return -1;
    //     }
    //     return minind+1;
    }
    public static void main(String[] args) {
        int arr[]={2};
        int k=1;
        System.out.println(srsfo(arr,k));
    }
}
