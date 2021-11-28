public class revnum {
    static int sum=0;
    static int fun(int n){
        if(n%10==0){
            return sum;
        }
        sum=sum*10+(n%10);
        fun(n/10);
        return sum;
    }
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
    static void fun2(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        fun2(n/10);
    }
    public static void main(String[] args) {
        System.out.println(fun(12345));
        fun2(12345);
        System.out.println();
        System.out.println(fun1(12345));
    }
}
