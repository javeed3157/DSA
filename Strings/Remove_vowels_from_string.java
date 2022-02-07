// Time:O(n)
// Space:O(1)
public class Remove_vowels_from_string{
    public static void main(String[] args) {
        String S = "welcome to geeksforgeeks";
        System.out.println(S.replaceAll("[aeiouAEIOU]", ""));
    }
}