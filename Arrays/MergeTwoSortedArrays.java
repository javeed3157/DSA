import java.util.Arrays;
import java.lang.Math;

public class MergeTwoSortedArrays {
    // Optimal method (gap method) or shell sort intuition
    //Time:O(a+b)log(a+b)
    //Space:O(1)
    public static void mTsA(int ar1[],int ar2[]){
        int i,j;
        int a=ar1.length;
        int b=ar2.length;
        int gap=(a+b)/2+(a+b)%2;
        while(gap>0){
            for(i=0;i+gap<a;i++){
                if(ar1[i]>ar1[i+gap]){
                    int temp = ar1[i];
                    ar1[i] = ar1[i + gap];
                    ar1[i + gap] = temp;
                }
            }
            for(j=gap>a?gap-a:0;i<a && j<b;i++,j++){
                if(ar1[i]>ar2[j]){
                    int temp = ar1[i];
                    ar1[i] = ar2[j];
                    ar2[j] = temp;
                }
            }
            if(j<b){
                for(j=0;j+gap<b;j++){
                    if(ar2[j]>ar2[j+gap]){
                        int temp = ar2[j];
                        ar2[j] = ar2[j + gap];
                        ar2[j + gap] = temp;
                    }
                }
            }
            gap=gap/2;
        }
    }

    //Time:O(nmlogm)
    //Space:O(1)
    // public static void mTsA(int ar1[],int ar2[]){
    //     for(int k=0;k<ar1.length;k++){
    //         if(ar1[k]>ar2[0]){
    //             int temp=ar1[k];
    //             ar1[k]=ar2[0];
    //             ar2[0]=temp;
    //             Arrays.sort(ar2);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int a1[] = {3 ,27 ,38 ,43};
        int a2[] = {9 ,10 ,82};
        mTsA(a1, a2);
        for(int i:a1){
            System.out.print(i+" ");
        }
        for(int i:a2){
            System.out.print(i+" ");
        }
    }
}
