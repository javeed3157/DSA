public class shift {
    public static void main(String[] args) {
        //a<<b=a*pow(2,b)
        //a>>b=a/pow(2,b)
        System.out.println(10<<2);
        System.out.println(100>>2);
        //n&1==1-->odd else even
        //last digit in binary form on num is lsb(least significant bit)
        System.out.println(17&1);//odd
        System.out.println(18&1);//even
        //xor of all elements in an arrays gives the num that is not repeated
        int a[]={2,1,2,1,3};
        int x=a[0];
        for(int i=1;i<a.length;i++){
            x^=a[i];
        }
        System.out.println(x);
        
    }
}
