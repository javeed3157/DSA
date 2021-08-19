// import java.util.Arrays;
//Time:O(n)
//Space:O(1)
public class Moores_Voting {
    public static int majority(int ar[],int k){
        int majorind=0;
        int count=1;
        // {4,4,4,2,2,4,6}
        for(int i=1;i<k;i++){
            if(ar[majorind]==ar[i]){
                count+=1;
            }
            else{
                count-=1;
            }
            if(count==0){
                majorind=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<k;i++){
            if(ar[i]==ar[majorind]){
                count+=1;
            }
        }
        if(count>k/2){
            return ar[majorind];
        }
        return -1;
    }
    
    //Time:O(n^2)
    //Space:O(1)
    // public static int majority(int a[],int e){
    //     int max=0;
    //     int ans = 0;
    //     for(int i=0;i<a.length;i++){
    //         int count=0;
    //         int check=a[i];
    //         for(int j=0;j<a.length;j++){
    //             if(a[j]==check){
    //                 count+=1;
    //             }
    //         }
    //         if(max<Math.max(max,count)){
    //             max=Math.max(max,count);
    //             ans=check;
    //         }
    //     }
        // if(max>(a.length)/2){
        //     return ans;
        // }
        // return -1;
    // }

    //Time:O(nlogn)
    //Space:O(1)
    // public static int majority(int a[],int e){
    //     Arrays.sort(a);
    //     int c=1;
    //     int max=0;
    //     int ans=0;
    //     int n=(a.length)/2;
    //     //2,2,4,4,4,4,6
    //     for(int i=1;i<a.length-1;i++){
    //         if(a[i]==a[i-1]){
    //             c+=1;
    //             max=Math.max(max,c);
    //             ans=a[i];
    //         }   
    //         else{
    //             c=1;
    //         }         
    //     }
    //     if(max>n){
    //         return c;
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int[] arr={4,4,4,2,2,4,6};
        
        int n=7;
        System.out.println(majority(arr, n));
    }
}
