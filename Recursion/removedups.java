//Time:O(n)
public class removedups {
    public static boolean[] arr=new boolean[26];
    static void removeduplicates(String s,int ind,String ne){
        if(ind==s.length()){
            System.out.println(ne);
            return;
        }
        char c=s.charAt(ind);
        if(arr[c-'a']==false){
            arr[c-'a']=true;
            ne+=c;
            removeduplicates(s, ind+1, ne);
        }
        else{
            removeduplicates(s, ind+1, ne);
        }
    }

    public static void main(String[] args) {
        String x="javeedsuhailshaik";
        removeduplicates(x, 0, "");
    }
}
