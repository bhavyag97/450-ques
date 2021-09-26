import java.util.Arrays;

public class allAtNegativeSide {
    public static void main(String[] args) {
        int a[] = {-1, -5, -6, -7, 1, 4, -6, -2};
        int b[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int c[]= {0, 0, 0, 0, 0, 0, 0, 0};
        int d[]={0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0;i<a.length;i++) {
            if (a[i] < 0) {
                for (int j = 0; j < a.length; j++) {
                    if (b[j] == 0) {
                        b[j] = a[i];
                        break;
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            if (a[i] > 0) {
                for (int j = 0; j < a.length; j++) {
                    if (c[j] == 0) {
                        c[j] = a[i];
                        break;
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        int val=0;
        for (int j=0;j<a.length;j++) {
            if (b[j] < 0) {
                d[j] = b[j];
                // System.out.println(d[j]);
            } else {
                val=j;
                break;
            }
        }
        for (int j=val;j<a.length;j++) {
                d[j]=c[j-val];


                // System.out.println(d[j]);
        }

        for(int i=0;i<a.length;i++){
            System.out.print(d[i]+" ");
        }

           }
        }






