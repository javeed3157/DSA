public class skipchar {
    public static void main(String args[]) {
        String s="baccdah";
        System.out.println(func(s));
        System.out.println(funcstr("hello I am Javeed Suhail"));
    }
    // public static void func(String a,String n){
    //     if(a.isEmpty()){
    //         System.out.println(n);
    //         return;
    //     }
    //     if(a.charAt(0) == 'a'){
    //         func(a.substring(1),n);
    //     }
    //     else{
    //         func(a.substring(1),n+a.charAt(0));
    //     }
    // }
    public static String func(String a){
        if(a.isEmpty()){
            return "";
        }
        if(a.charAt(0) == 'a'){
            return func(a.substring(1));
        }
        else{
            return a.charAt(0)+func(a.substring(1));
        } 
    }
    public static String funcstr(String a){
        if(a.isEmpty()){
            return "";
        }
        if(a.startsWith("Javeed")){
            return funcstr(a.substring(6));
        }
        else{
            return a.charAt(0)+funcstr(a.substring(1));
        } 
    }
}