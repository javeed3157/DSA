public class MaxTilli {
    public static int mti(int a[],int k){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            mx=Math.max(mx,a[i]);
        }
        return mx;
    }
    public static void main(String[] args) {
        int arr[]={0,-9,1,3,-4,5};
        int i=arr.length;
        System.out.println(mti(arr,i));
    }
}
