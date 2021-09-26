import java.util.Arrays;

public class unionAndIntersectionOf2Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 9};
        int b[] = {1, 4, 5, 9, 1, 0, 0};
        int u[] = new int[a.length + 1];
        System.out.print("Intersection of two array is =");
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    u[i] = a[i];
                    System.out.print(u[i] + " ");

                    break;


                }

            }

        }
        System.out.println();
        System.out.print("Union of two array is =");
        for (int i = 0; i < a.length; i++) {

            u[i] = a[i];
            // System.out.print(u[i]);

            for (int j = 0; j <= b.length; j++) {
                if (u[i] == 0) {
                    if (u[i] != b[i]) {
                        u[i] = b[j];
                    }

                }


            }


        }

        for (int k = 0; k < u.length; k++) {

            Arrays.sort(u);
            if (u[k] >-1) {


                System.out.print(u[k]);
            }
        }
    }
}

