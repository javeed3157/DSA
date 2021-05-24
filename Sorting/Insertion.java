//Time:O(n^2)
//Space:O(1)
public class Insertion {
    public static int[] inser(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int curr=a[i];
            int j=i-1;
            while(j>=0 && a[j]>curr){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        for(int i:inser(arr)){
            System.out.print(i+" ");
        }
    }
}
