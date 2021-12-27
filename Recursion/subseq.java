public class subseq {
    static void subsequences(String s,int ind,String n){
        if(ind==s.length()){
            System.out.println(n);
            return;
        }
        char c=s.charAt(ind);
        subsequences(s, ind+1, n+c);
        subsequences(s, ind+1, n);
    }
    public static void main(String[] args) {
        String s="abc";
        subsequences(s,0,"");
    }
}
