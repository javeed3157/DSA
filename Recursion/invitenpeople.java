public class invitenpeople {
    static int callguest(int n){
        if(n<=1){
            return 1;
        }
        int way1=callguest(n-1);//Singles
        int way2=(n-1)*callguest(n-2);//Pairs
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callguest(n));
    }
}
