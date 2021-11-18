public class rev {
    public static void revnum(int n){
        if(n>0){
            System.out.print(n%10);
            revnum(n/10);
        }
    }
    public static void main(String[] args) {
        revnum(1234);
    }
}
