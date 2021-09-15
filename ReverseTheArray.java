import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr ={6,2,3,5,1};




        for(int i=0;i<(arr.length)/2;i++) {


            int temp;
            temp = arr[i];
            arr[i] = arr[4-i];
            arr[4-i] = temp;



        }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
//        System.out.println();
//
//        for (int j=arr.length-1;j>=0;j--){
//            System.out.print(arr[j]);

        }

        }


