// This code is not working when
//             11
//             01
// When both the unit digit integer are 1

import java.util.Scanner;
public class BinaryAddition {
    public static int reverse(int num){
        int r=0;
        while(num>0){
            int ld=num%10;
            r=r*10+ld;
            num/=10;
        }
        return r;
    }
    public static int binadd(int n1,int n2){
        int ans=0;
        int prevcarry=0;
        while(n1>0 && n2>0){
            if(n1%2==0 && n2%2==0){
                ans=ans*10+prevcarry;
                prevcarry=0;
            }
            else if((n1%2==1 && n2%2==0) || (n1%2==0 && n2%2==1)){
                if(prevcarry==1){
                    ans=ans*10+0;
                    prevcarry=1;
                }
                else{
                    ans=ans*10+1;
                    prevcarry=0;
                }
            }
            else{
                ans=ans*10+prevcarry;
                prevcarry=1;
            }
            n1/=10;
            n2/=10;
        }
        
        while(n1>0){
            if(prevcarry==1){
                if(n1%2==0){
                    ans=ans*10+1;
                    prevcarry=0;
                }
                else{
                    ans=ans*10+0;
                    prevcarry=1;
                }
            }
            else{
                ans=ans*10+(n1%2);
            }
            n1/=10;
        }
        while(n2>0){
            if(prevcarry==1){
                if(n2%2==0){
                    ans=ans*10+1;
                    prevcarry=0;
                }
                else{
                    ans=ans*10+0;
                    prevcarry=1;
                }
            }
            else{
                ans=ans*10+(n2%2);
            }
            n2/=10;
        }
        if(prevcarry==1){
            ans=ans*10+1;
        }
        ans=reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(binadd(a,b));
        sc.close();
    }
}
