//#KickStart
public class LongestArithmaticSubArray{
    public static int las(int a[]){
        int count=2;
        int diff=a[0]-a[1];
        int ans=2;
        for(int i=1;i<a.length-1;i++){
            if(diff==a[i]-a[i+1]){
                count+=1;
            }
            else{
                diff=a[i]-a[i+1];
                count=2;
            }
            ans=Math.max(ans, count);            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,7,4,6,8,10,11,12,11,13,14};
        System.out.println(las(arr));
    }
}