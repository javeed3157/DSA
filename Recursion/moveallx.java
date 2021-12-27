//Time:O(n)
public class moveallx{
    public static void xtoend(String s,int ind,int c,String news){
        if(ind==s.length()){
            for(int i=0;i<c;i++){
                news+='x';
            }
            System.out.println(news);
            return;
        }
        if(s.charAt(ind)=='x'){
            c+=1;
            xtoend(s, ind+1, c,news);
        }
        else{
            news+=s.charAt(ind);
            xtoend(s, ind+1, c, news);
        }
    }
    public static void main(String[] args) {
        String s="axbxxxnxstew";
        xtoend(s, 0, 0,"");
    }
}