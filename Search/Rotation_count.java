public class Rotation_count {
    public  static int search(int[] nums) {
        int mount=-1;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid<h && nums[mid]>nums[mid+1]){
                mount=mid;
                break;
            }
            if(mid>l && nums[mid-1]>nums[mid]){
                mount=mid-1;
                break;
            }
            if(nums[mid]<nums[l]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(mount==-1){
            return 0;
        }
        return mount+1;
    }
    public static void main(String[] args) {
        int ar[]={15, 18, 2, 3, 6, 12};
        System.out.println(search(ar));
    }
}
