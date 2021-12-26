//Time:O(n)
public class strev {
    static void rev(String s){
        if(s.length()==0){
            return;
        }
        char a=s.charAt(0);
        rev(s.substring(1));
        System.out.print(a);
    }
    static void revr(String s,int ind){
        if(ind==0){
            System.out.print(s.charAt(0));
            return;
        }
        System.out.print(s.charAt(ind));
        revr(s,ind-1);
    }
    public static void main(String[] args) {
        String s="javeed";
        rev(s);
        System.out.println();
        revr(s, s.length()-1);
    }
}
