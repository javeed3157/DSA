import java.util.List;
import java.util.ArrayList;
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
        System.out.println(li);
    }
}