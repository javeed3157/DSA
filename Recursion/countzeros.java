public class countzeros {
    static int count=0;
    static int c(int n){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count+=1;
        }
        return c(n/10);
    }
    //We can also use a helper function to avoid external count declaration
    
    static int fun2(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c+=1;
        }
        return helper(n/10,c);
    }
    public static void main(String[] args) {
        int num=1020303;
        System.out.println(c(num));
        System.out.println(fun2(num));
    }
}
