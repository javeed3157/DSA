public class tilefill {
    //Here we considered tile size as 1*m
    static int place(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int ver=place(n-m, m);
        int hor=place(n-1, m);
        return ver+hor;
    }
    public static void main(String[] args) {
        // int n=3,m=3;
        // int n=2,m=3;
        int n=4,m=2;
        System.out.println(place(n,m));
    }
}
