import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// Time:O(n)
// Space:O(n)
public class Smallest_number_on_left {
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && s.peek() >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(s.peek());
            }
            s.push(a[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {1, 5, 0, 3, 4, 5};
        for(Integer i :leftSmaller(a.length,a)){
            System.out.print(i+" ");
        }
    }
}
