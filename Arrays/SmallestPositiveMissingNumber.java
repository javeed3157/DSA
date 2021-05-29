//Amazon,Accolite,Samsung,Snapdeal
//Time,Space:O(n)
public class SmallestPositiveMissingNumber {
        public static int firstMissingPositive(int[] nums) {
            boolean check[]=new boolean[nums.length+1];
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0 && nums[i]<=nums.length){
                    check[nums[i]]=true;
                }
            }
            for(int i=1;i<check.length;i++){
                if(!check[i]){
                    return i;
                }
            }
            return nums.length+1;
        }
    public static void main(String[] args) {
        int a[]={1,2,0};
        System.out.println(firstMissingPositive(a));
    }
    
}
