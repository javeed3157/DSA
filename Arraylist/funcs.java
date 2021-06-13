import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class funcs{
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        // li.remove(0);    (To remove by index )
        // li.remove(Integer.valueOf(20));      (To remove by value )
        // li.add(1,30);    (To add in a particular index)
        li.get(1);
        // li.clear();      (To clear the whole list)
        // li.set(1,100);      (To update a value)
        List<Integer> li2=new ArrayList<Integer>();
        li2.add(30);
        li2.add(40);
        li.addAll(li2);     
        // System.out.println(li.contains(20));
        // li.contains(20);
        // li.removeAll(li2);   (To remove some collction of elements from one list)
        // li.isEmpty();
        System.out.println(li);
        //Conversion of arraylist to array
        Integer arr[]=new Integer[li.size()];
        li.toArray(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        // System.out.println(Arrays.toString(arr));
    }
}