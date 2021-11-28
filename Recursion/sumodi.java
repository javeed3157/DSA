public class sumodi {
    static int fun(int n){
        if(n==0){
            return 0; 
        }
        return (n%10)+fun(n/10);
    }
    public static void main(String[] args) {
        System.out.println(fun(12345));
    }
}
