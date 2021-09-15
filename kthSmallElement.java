import java.util.Arrays;
import java.util.Scanner;

public class kthSmallElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={8,2,3,4,5,1};
        for (int i=0;i<= a.length;i++){
            Arrays.sort(a);


        }
        int b[]=new int[7];
        b[1]=a[0];
        b[2]=a[1];
        b[3]=a[2];
        b[4]=a[3];
        b[5]=a[4];
        b[6]=a[5];
        for (int j=1;j<=b.length-1;j++) {


        }
        System.out.println("enter the no of min element=");
        int k = sc.nextInt();
        System.out.println("min element in an array=" + b[k]);

        System.out.println();
    }
}
