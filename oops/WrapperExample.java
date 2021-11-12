public class WrapperExample {
    public static void main(String[] args) {
        int c=10;//Primitive 
        Integer a=20;
        Integer b=30;
        System.out.println(a+" "+b);

        final int NOTHING=50;//Its const and cant be modified for primitive datatypes
        // NOTHING=20;
        // final int DEC;//It should be initialized at declaration itself
        
        final check obj=new check(50);//final non primitive datatypes like references their value can be changed  but their reference cant be reassigned
        obj.no=40;
        System.out.println(obj.no);
        // obj=new check(100);//Reference of a final cant be reassigned

        //Garbage collection
        // check o;
        // for(int i=0;i<1000000000;i++){
        //     o=new check();
        // }   
        System.out.println(obj);

    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}
class check{
    int no;
    check(){
        System.out.println("Object is created");
    }
    check(int no){
        this.no=no;
    }
    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Object destroyed with this destructor");
    // }
}
