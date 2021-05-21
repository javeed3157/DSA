//Time: Worst(O(n^2))  ;  best(O(n))
//Space:O(1)
public class Bubble {
    public static int[] bubblesort(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            boolean check=false;
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    check=true;
                }
            }
            if(!check){
                break;
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,3,6,5,8,7,0,9};
        for(int i:bubblesort(arr)){
            System.out.print(i+" ");
        }
    }
}