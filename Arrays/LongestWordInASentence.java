import java.util.Scanner;

public class LongestWordInASentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=new char[s.length()];
        int currlen=0,maxlen=0;
        int cind=0;
        int aind=0;
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(arr[i] != ' '){
                currlen+=1;
            }
            else{
                if(currlen>maxlen){
                    maxlen=currlen;
                    aind=cind;
                }
                cind=i+1;
                currlen=0;
            }
        }
        if(currlen>maxlen){
            maxlen=currlen;
            aind=cind;
        }
        System.out.println(maxlen);
        for(int i=0;i<maxlen;i++){
            System.out.print(arr[i+aind]);
        }
    }
}
