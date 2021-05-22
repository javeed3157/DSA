public class Insertion {
    public static int[] inser(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
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
