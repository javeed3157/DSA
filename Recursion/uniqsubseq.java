import java.util.HashSet;
public class uniqsubseq{
    // static HashSet<String> h=new HashSet<>(); //This can also be considered
    static void uubsequences(String s,int ind,String ne,HashSet<String> h){
        if(ind==s.length()){
            if(!h.contains(ne)){
                System.out.println(ne);
                h.add(ne);
                return;
            }
            else{
                return;
            }
        } 
        uubsequences(s, ind+1, ne+s.charAt(ind),h);
        uubsequences(s, ind+1, ne,h);
    }
    public static void main(String[] args) {
        String s="aaa";
        HashSet<String> h=new HashSet<>();
        uubsequences(s,0,"",h);
    }
}