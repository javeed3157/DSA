import java.util.HashMap;

public class Longest_Sub_Array_with_Sum_K{
    public static int lenOfLongSubarr (int nums[], int N, int k) {
        int maxl  = 0;
        int curr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            curr += nums[i];
            if(curr == k){
                maxl = i + 1;
            }
            if (!map.containsKey(curr)){
                map.put(curr, i);
            }
            if(map.containsKey(curr - k)){
                maxl = Math.max(maxl, i - map.get(curr - k));
                
            }
        }
        return maxl;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int K = 15;
        int N = nums.length;
        System.out.println(lenOfLongSubarr(nums, N, K));
    }
}