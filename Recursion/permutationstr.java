//Time:O(n*n!)
public class permutationstr {
    public static void permutations(String s,String permutate){
        if(s.length()==0){
            System.out.println(permutate);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String news=s.substring(0, i)+s.substring(i+1);
            permutations(news,permutate+c);    
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permutations(s, "");
    }
}
