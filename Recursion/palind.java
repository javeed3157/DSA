public class palind {
    static int fun1(int n){
        if(n%10==n){
            return n;
        }
        int d=helper(n);
        return (n%10)*(int)Math.pow(10, d-1)+fun1(n/10);
    }
    static int helper(int n){
        int total_digits=(int)(Math.log10(n))+1;
        return total_digits;
    }
    public static void main(String[] args) {
        int num=12321;
        if(num==fun1(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
