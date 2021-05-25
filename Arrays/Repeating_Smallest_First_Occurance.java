//Oracle,Amazon
public class Repeating_Smallest_First_Occurance {
    public static int srsfo(int a[],int n){
        int minind=Integer.MAX_VALUE;
        int ar[]=new int[1000000];
        for(int i=0;i<ar.length;i++){
            ar[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(ar[a[i]] !=-1){
                minind=Math.min(minind,ar[a[i]]);
            }
            else{
                ar[a[i]]=1;
            }
        }
        return minind+1;
        //Through Brute Force
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(a[i]==a[j]){
        //             ind=Math.min(ind,i);
        //         }
        //     }
        // }
        // return ind+1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,3,5,6};
        int k=7;
        System.out.println(srsfo(arr,k));
    }
}
