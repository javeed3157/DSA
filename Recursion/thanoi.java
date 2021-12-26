public class thanoi {
    public static void towerofhanoi(int n,String s,String h,String d){
        if(n==1){
            System.out.println("Transfer the disc "+n+" "+ "from" +" "+s+" "+"to"+" "+ d);
            return;
        }
        towerofhanoi(n-1, s, d, h);
        System.out.println("Transfer the disc "+n+" "+ "from" +" "+s+" "+"to"+" "+ d);
        towerofhanoi(n-1, h, s, d);
    }
    
    public static void main(String[] args) {
        // int n=1;
        // int n=2;
        int n=3;
        towerofhanoi(n, "S", "H", "D");
    }
}
