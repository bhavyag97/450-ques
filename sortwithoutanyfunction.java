public class sortwithoutanyfunction {
    public static void main(String[] args) {
        int a[] = {1, 1, 0, 2, 2};
        int b[] = new int[4];

        for (int i = 0; i < a.length ; i++) {
            for (int j=i+1;j<a.length;j++){
                int temp=0;
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;

                }

            }
            System.out.print(a[i]);
        }
    }
}
