   import java.util.*;


public class cycalicRotationOfarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
            int n=sc.nextInt();
        int last;

        int a[] = new int[n] ;
        System.out.println("enter the elements");
        for (int k=0;k<a.length;k++){

            a[k]=sc.nextInt();
        }
//        int b[]=new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//
//          b[0]=a[4];
//          b[1]=a[0];
//          b[2]=a[1];
//          b[3]=a[2];
//          b[4]=a[3];
//        }
//        for(int j=0;j<b.length;j++){
//            System.out.print(b[j]+" ");
//        }
        last=a[a.length-1];
        for (int i = a.length-1; i >= 0; i--) {
            int temp;
            if(i==0){
                a[i]=last;
            }else {
                temp = a[i];
                a[i] = a[i - 1];
            }

            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] +" ");
            }
        }
    }
