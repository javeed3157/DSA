public class NthMagicNumber {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        int sum=0;
        while(n>0){
            if((n&1)==1){
                sum+=Math.pow(5, count);
            }
            count+=1;
            n>>=1;
        }
        System.out.println(sum);
    }
}
