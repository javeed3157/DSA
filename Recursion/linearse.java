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

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(find(a,2,0));
        int b[]={1,2,4,3,4,5};
        System.out.println(findlast(b, 4, b.length-1));
        findall(b,4,0);
        System.out.println(li);
    }
}
