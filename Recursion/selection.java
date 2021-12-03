import java.util.Arrays;
public class selection {
    static void select(int a[],int r,int c,int m){
        if(r==0){
            return;
        }
        if(c<r){
            if(a[c]>a[m]){
                select(a, r,c+1,c);
            }
            else{
                select(a, r,c+1,m);
            }
        }
        else{
            int temp=a[m];
            a[m]=a[r-1];
            a[r-1]=temp;
            select(a, r-1,0,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,0};
        select(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
