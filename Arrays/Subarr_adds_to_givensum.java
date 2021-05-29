public class Subarr_adds_to_givensum {

    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int sum=12;
        int currsum=0;
        int st=-1;
        int end=-1;
        int j=0;
        int i=0;
        while(j<a.length && currsum+a[j]<=sum){
            currsum+=a[j];
            j++;
        }
        if(currsum==sum){
            System.out.print(i+1+" "+j);
        }
        else{
            while(j<a.length){
                currsum+=a[j];
                while(currsum>sum){
                    currsum-=a[i];
                    i+=1;

                }
                if(currsum==sum){
                    st=i+1;
                    end=j+1;
                    break;
                }
                j+=1;
            }
            System.out.println(st+" "+end);
        }
    }
}
