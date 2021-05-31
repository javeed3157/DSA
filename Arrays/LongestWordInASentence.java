import java.util.Scanner;

public class LongestWordInASentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=new char[s.length()];
        int currlen=0,maxlen=0;
        String str="";
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(arr[i] != ' '){
                currlen+=1;
                str+=arr[i];
                maxlen=Math.max(maxlen,currlen);
            }
            else{
                // maxlen=Math.max(maxlen,currlen);
                currlen=0;
                str="";
            }
        }
        // maxlen=Math.max(maxlen,currlen);
        System.out.println(maxlen);
        System.out.println(str);
    }
}
