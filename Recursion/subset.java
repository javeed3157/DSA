import java.util.ArrayList;

public class subset{
    public static void main(String[] args) {
        sub("", "abc");
        System.out.println(subs("", "abc"));
        subacii("", "abc");
    }
    static void sub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));
    }
    static void subacii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subacii(p+ch, up.substring(1));
        subacii(p, up.substring(1));
        subacii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subs(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> li=new ArrayList<>();
            li.add(p);
            return li;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subs(p+ch, up.substring(1));
        ArrayList<String> right=subs(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subsdup(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> li=new ArrayList<>();
            li.add(p);
            return li;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subs(p+ch, up.substring(1));
        ArrayList<String> right=subs(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
