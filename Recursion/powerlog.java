//Time:O(logn)
public class powerlog {
    static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return pow(x, n/2)*pow(x, n/2);
        }
        else{
            return pow(x, n/2)*pow(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2,2));
    }
}
