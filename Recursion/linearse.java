import java.util.ArrayList;

public class linearse {
    static int find(int a[],int t,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==t){
            return i;
        }
        else{
            return find(a, t, i+1);
        }
    }
    static int findlast(int a[],int t,int i){
        if(i==-1){
            return -1;
        }
        if(a[i]==t){
            return i;
        }
        else{
            return findlast(a, t, i-1);
        }
    }
    static ArrayList<Integer> li=new ArrayList<>();
    static int findall(int a[],int t,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==t){
            li.add(i);
        }
        return findall(a, t, i+1);
    }
    static ArrayList<Integer> findalls(int a[],int t,int i,ArrayList<Integer> li){
    //Here for same object is taken in each call and the diff references points towards the same obj
        if(i==a.length){
            return li;
        }
        if(a[i]==t){
            li.add(i);
        }
        return findalls(a, t, i+1,li);
    }
    static ArrayList<Integer> findalls2(int a[],int t,int i){
        ArrayList<Integer> li=new ArrayList<>();
        //Here we are creating new arraylist in each call
            if(i==a.length){
                return li;
            }
            if(a[i]==t){
                li.add(i);
            }
            ArrayList<Integer> ansfrombelowcalls=findalls2(a, t, i+1);
            li.addAll(ansfrombelowcalls);
            return li;
        }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(find(a,2,0));
        int b[]={1,2,4,3,4,5};
        System.out.println(findlast(b, 4, b.length-1));
        findall(b,4,0);
        System.out.println(li);
        System.out.println(findalls(b,4,0,new ArrayList<>()));
        System.out.println(findalls2(b, 4, 0));
    }
}
