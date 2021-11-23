import java.util.ArrayList;

public class S1 {
    public static void main(String[] args) {
        //Strings are immutable
        String st="hjdv";
        String st1="hjdv";
        System.out.println(st==st1);//Pool area and points to same obj
        String str=new String("ijkl");
        String str1=new String("ijkl");
        System.out.println(str==str1);//Heap area and points to diff obj
        System.out.println(str.equals(str1));//Hear only value is checked
        System.out.println(st.charAt(2));
        System.out.println(str.charAt(2));
        float a=1234.123f;
        System.out.printf("%.2f\n",a);//Printing formatted string
        System.out.printf("%.3f\n",Math.PI);
        System.out.printf("Hello I am %s and my 10th percentage is %.0f\n","Javeed",100.0);
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+5));
        System.out.println('a'+1);
        System.out.println("a"+1);
        System.out.println("a"+new ArrayList<>());
        System.out.println("a"+'b');
    }
}
