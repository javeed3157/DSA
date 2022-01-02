import java.util.ArrayList;
import java.util.Collections;

public class subsetsum {
    //Time:O(2^n)
    //Space:O(n)
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        subsets(arr,ans,li,0);
        Collections.sort(ans);
        return ans;
    }
    public static void subsets(ArrayList<Integer> arr, ArrayList<Integer> ans,ArrayList<Integer> li,int start){
        if(start==arr.size()){
            int sum=0;
            for(int i=0;i<li.size();i++){
                sum+=li.get(i);
            }
            ans.add(sum);
            return;
        }
        li.add(arr.get(start));
        subsets(arr,ans,li,start+1);
        li.remove(li.size()-1);
        subsets(arr,ans,li,start+1);
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(3);
        for(Integer l:subsetSums(nums,nums.size())){
            System.out.println(l);
        }
        System.out.println(subsetSums(nums,nums.size()).toString());
    }
}
