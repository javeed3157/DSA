//By moving right or down
public class totpathsinmaze {
    public static int countpath(int i,int j,int m,int n){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int down=countpath(i+1, j, m, n);
        int right=countpath(i, j+1, m, n);
        return down+right;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(countpath(0,0,m,n));
    }
}

