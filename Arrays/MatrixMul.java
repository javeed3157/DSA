//Time:O(n^3)
//Space:O(n)
public class MatrixMul {
    public static void main(String[] args) {
        int a[][]={{2,4,1,2},{8,4,3,6}};
        int b[][]={{1,2},{3,4},{5,6},{7,8}};
        int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
