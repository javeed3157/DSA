public class Builder {
    public static void main(String[] args) {
        StringBuilder b=new StringBuilder();
        //Using SB only once the obj is created and char are appended to it so space comp is reduced
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            b.append(ch);
        }
        System.out.println(b);
        System.out.println(b.deleteCharAt(25));
    }
}
