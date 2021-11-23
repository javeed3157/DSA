import java.util.Scanner;

public class palind {
    public static boolean ispal(String b){
        if(b==null || b.length()==0){
            return true;
        }
        b=b.toLowerCase();
        int s=0;
        int e=b.length()-1;
        boolean a=true;
        while(s<e){
            if(b.charAt(s)==b.charAt(e)){
                s+=1;
                e-=1;
                continue;
            }
            else{
                a=false;
                break;
            }
        }
        if(a){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String b=new String();
        Scanner sc=new Scanner(System.in);
        b=sc.nextLine();
        System.out.println(ispal(b));
        sc.close();
    }
}
