//Time:O(n)
//Space:O(1)
public class MissingnRepeating{
    public static void mNr(int a[],int v){
        int xor1,setbit,i;
        int x=0,y=0;
        xor1=a[0];
        for (i = 1; i < v; i++){
            xor1 = xor1 ^ a[i];
        }
        for (i = 1; i <= v; i++){
            xor1 = xor1 ^ i;
        }
        setbit=xor1 & ~(xor1-1);
        for(i = 0; i < v ; i++){
            if((a[i] & setbit) != 0){
                x = x ^ a[i];
            }
            else{
                y = y ^ a[i];
            }
        }
        for(i = 0; i <= v ; i++){
            if((i & setbit) != 0){
                x = x ^ i;
            }
            else{
                y = y ^ i;
            }
        }
        System.out.println("Missing number is "+x+" Repeating number is "+y);
    }
    public static void main(String[] args) {
        int arr[]={ 1, 3, 4, 5, 1, 6, 2 };
        int n=arr.length;
        mNr(arr,n);
    }
}