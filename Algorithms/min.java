public class min{
    public static int minsumsub(int arr[]){
        int minsum=Integer.MAX_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<minsum){
                minsum=currsum;
            }
            if(currsum>0){
                currsum=0;
            }
        }
        return minsum;
    }
    public static void main(String[] args) {
        int ar[]={5,-4,-2,6,-1};
        // int ar[]={-5,-4,-2,-6};
        System.out.println(minsumsub(ar));
    }
}
