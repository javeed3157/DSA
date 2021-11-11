public class main{
    public static void main(String[] args) {
        //Classname objname=new constructor()
        Student ob1=new Student();
        Student ob2=new Student(20,"jwnen",98);
        Student ob3=new Student(ob1);
        System.out.println(ob1.rno);
        System.out.println(ob2.rno);        
        System.out.println(ob3.rno);

        chain o1=new chain();
        System.out.println(o1.x+","+o1.y);

        Student one=new Student();
        Student two=one;//As both refer to same obj change in one changes the other too
        two.name="iejrg";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}
class Student{
    int rno;
    String name;
    int marks;
    Student(){
        this.rno=10;//Refers to the currobj like ob1.rno=10
        this.name="hbcs";
        this.marks=100;
    }
    Student(int rno,String name,int marks){
        this.rno=20;
        this.name=name;
        this.marks=marks;
    }
    Student(Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
}

//Constructor chaining using this
class chain{
    int x;
    int y;
    chain(){
        this(1,2);
    }
    chain(int x,int y){
        this.x=x;
        this.y=y;
    }
}