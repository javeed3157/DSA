//Time:O(n)
//Space:O(1)
public class Moores_Voting {
    public static int majority(int ar[],int k){
        int majorind=0;
        int count=1;
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
    public static void main(String[] args) {
        int[] arr={4,2,3,4,4,6,4};
        int n=7;
        System.out.println(majority(arr, n));
    }
}
