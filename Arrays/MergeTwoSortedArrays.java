import java.util.Arrays;

public class MergeTwoSortedArrays {

    //Time:O(nmlogm)
    //Space:O(1)
    public static void mTsA(int ar1[],int ar2[]){
        // int i=ar1[0];
        // int j=ar2[0];
        for(int k=0;k<ar1.length;k++){
            if(ar1[k]>ar2[0]){
                int temp=ar1[k];
                ar1[k]=ar2[0];
                ar2[0]=temp;
                Arrays.sort(ar2);
            }
        }
        for(int i:ar1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:ar2){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a1[] = {3 ,27 ,38 ,43};
        int a2[] = {9 ,10 ,82};
        mTsA(a1, a2);
    }
}
