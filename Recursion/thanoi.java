// Time:O(2^n-1) ~ O(2^n)
public class thanoi {
    public static void towerofhanoi(int n,String s,String h,String d){
        if(n==1){
            System.out.println("Transfer the disc "+n+" "+ "from" +" "+s+" "+"to"+" "+ d);
            return;
        }
        towerofhanoi(n-1, s, d, h);//1st step tranfering n-1 discs from Src to Help using Dest
        System.out.println("Transfer the disc "+n+" "+ "from" +" "+s+" "+"to"+" "+ d);//nth number disc transfer
        towerofhanoi(n-1, h, s, d);//2nd step tranfering n-1 discs from Help to Dest using Src
    }
    
    public static void main(String[] args) {
        // int n=1;
        // int n=2;
        int n=3;
        towerofhanoi(n, "S", "H", "D");
    }
}
