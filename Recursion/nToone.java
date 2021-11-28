public class nToone {
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(--n);//We can also pass n-1 but not n-- bcause n-- means pass n first then do -1
    }
    public static void main(String[] args) {
        fun(10);
    } 
}
