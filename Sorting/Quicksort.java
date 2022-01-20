// Time Complexity :
//     Worst : O(n^2)
//     Average : O(nlogn)
// Space Complexity :
//     Worst : O(n)
//     Average : O(logn)
public class Quicksort {
    public static void quick(int[] arr, int s, int e) {
        if(s < e){
            int pivotInd = partition(arr, s, e);
            quick(arr, s, pivotInd - 1);
            quick(arr, pivotInd + 1, e);
        }
    }
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int i = s - 1;
        for(int j = s; j < e; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        quick(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
