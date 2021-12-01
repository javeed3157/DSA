public class RotBinSear {
    static int search(int a[],int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(a[m]==t){
            return m;
        }
        if(a[s]<=a[m]){
            if(t>= a[s] && t<=a[m]){
                return search(a, t, s, m-1);
            }
            else{
                return search(a, t, m+1, e);
            }
        }
        if(t>=a[m] && t<=a[e]){
            return search(a, t, m+1, e);
        }
        else{
            return search(a, t, s, m-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3,4};
        System.out.println(search(arr, 1, 0, arr.length-1));
        System.out.println(search(arr, 6, 0, arr.length-1));
        System.out.println(search(arr, 3, 0, arr.length-1));
        System.out.println(search(arr, 8, 0, arr.length-1));
        System.out.println(search(arr, 10, 0, arr.length-1));
    }
}
