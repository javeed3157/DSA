//Time:O(n^2)
//Space:O(1)
public class Selection {
    public static int[] select(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min != i){
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        for(int i:select(arr)){
            System.out.print(i+" ");
        }
    }
}
