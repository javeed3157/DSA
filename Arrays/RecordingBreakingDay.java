//#KickStart
public class RecordingBreakingDay {
    public static int rbd(int a[]){
        int ans=Integer.MIN_VALUE;
        int count=0;
        if(a.length==1){
            return 1;
        }
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1 && a[i]>ans && a[i]>a[i+1]){
                count+=1;
            }
            if(i==a.length-1 && a[i]>ans){
                    count+=1;
            }
            ans=Math.max(ans,a[i]);
            }
            return count;
        }
    public static void main(String[] args) {
        int arr[]={1,2,0,7,2,0,2,0};
        // int arr[]={4,8,15,16,23,42};
        // int arr[]={3,1,4,1,5,9,2,6,5};
        // int arr[]={9,9,9,9,9,9};
        System.out.println(rbd(arr));
    }
}
