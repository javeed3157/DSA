import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String a="kjnsvjk  ";
        System.out.println(Arrays.toString(a.toCharArray()));
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(Arrays.toString(a.substring(2).toCharArray()));
        System.out.println(a.indexOf('s'));
        System.out.println(Arrays.toString("   sdvkj  ".trim().toCharArray()));
        System.out.println(Arrays.toString(a.substring(1, 3).toCharArray()));
        System.out.println(Arrays.toString("   jaja   ".strip().toCharArray()));
        System.out.println(a.compareTo(new String("kjnsvjk  ")));//Same so 0
        System.out.println(a.compareTo(new String("kjnsvjk   ")));//lt so -1
        System.out.println(a.compareTo(new String("kjnsvjk ")));//gt so 1
        System.out.println(Arrays.toString(a.split("j")));
    }
}
