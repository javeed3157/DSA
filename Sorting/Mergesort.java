// Time:O(nlogn)
public class Mergesort{
    public static void divide(int[] arr, int s, int e){
        if(s >= e){
            return;
        }
        int mid = s + (e - s)/2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conquer(arr, s, mid, e);
    }
    public static void conquer(int[] arr, int s, int mid, int e){
        int[] merged = new int[e - s + 1];
        int ind1 = s;
        int ind2 = mid + 1;
        int x = 0;
        while(ind1 <= mid && ind2 <= e){
            if(arr[ind1] <= arr[ind2]){
                merged[x++] = arr[ind1++];
            }
            else{
                merged[x++] = arr[ind2++];
            }
        }
        while(ind1 <= mid){
            merged[x++] = arr[ind1++];
        }
        while(ind2 <= e){
            merged[x++] = arr[ind2++];
        }
        for(int i = 0, j = s; i < merged.length ; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}