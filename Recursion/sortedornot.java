public class sortedornot{
    static boolean sorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        return a[i]<a[i+1] && sorted(a,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(sorted(a,0));
    }
}