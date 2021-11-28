public class sumofn{
    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        else{
            return  n+sumn(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumn(100));
    }
}