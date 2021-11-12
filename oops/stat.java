public class stat {
    // void print(){ //It is non static it depends on instance
    //     System.out.println("jjjjjj kkkkk");
    // }
    static void print(){
        System.out.println("jjjjjj kkkkk");
    }
    static{
        System.out.println("This static block executes first");
    }
    public static void main(String[] args) {
        //A static method can only call static methods 
        // The static method cannot use non static data member or call non-static method directly.
        // this and super cant be used inside a static method
        System.out.println(staticexp.tot);//A static method or var can be invoked without the need for creating an instance of a class.
        staticexp2.change();
        staticexp jj=new staticexp();
        staticexp kk=new staticexp();
        staticexp2 j=new staticexp2();
        staticexp2 k=new staticexp2();
        System.out.println(j.tot);
        System.out.println(k.tot);
        System.out.println(staticexp.tot);
        print();
    }
}
class staticexp{
    static int tot;//Only once the memory gets allocated
    staticexp(){
        staticexp.tot+=1;
        System.out.println(tot);
    }
}
class staticexp2{
    static int tot=10;
    static void change(){
        tot=20;//It can also be give as staticexp2.tot=20 
    }
    staticexp2(){
        staticexp2.tot+=1;
    }
}