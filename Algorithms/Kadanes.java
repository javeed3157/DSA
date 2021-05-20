//Time:O(n)
//Space:O(1)
public class Kadanes {
    public static int maxsumsub(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int ar[]={5,-4,-2,6,-1};
        // int ar[]={-5,-4,-2,-6};
        System.out.println(maxsumsub(ar));
    }
}
