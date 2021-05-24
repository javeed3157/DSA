public class AllSubArrSum {
    public static void sarrs(int ar[]){
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=i;j<ar.length;j++){
                sum+=ar[j];
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,0,7,2};
        sarrs(a);
    }
}
