import java.util.Arrays;

public class allAtNegativeSide {
    public static void main(String[] args) {
        int a[]={-1,-5,-6,-7,1,4,-6,-2};
     for(int i=0;i<a.length;i++){
         Arrays.sort(a);
         System.out.print(a[i]+" ");
     }
    }

}
