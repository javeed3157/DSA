//Time:O(2^n)
import java.util.ArrayList;
public class subsetsofn {
    static void printsubsets(ArrayList<Integer> l){
        for (Integer i : l) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void subsets(int n,ArrayList<Integer> l){
        if(n==0){
            printsubsets(l);
            return;
        }
        l.add(n);
        subsets(n-1, l);
        l.remove(l.size()-1);
        subsets(n-1, l);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> l=new ArrayList<>();
        subsets(n,l);
    }
}
