package HW3;


import java.util.Arrays;

/**
 * Created by pc on 02.04.2015.
 */
public class Array {

    // int[] leftArray= new int[]{1,5,4,23,65,32,78};
    // int[] rightArray= new int[]{3,5,24,4,1,2,34,45,32,5};

    public int[] leftJoin(int[] leftArray, int[] rightArray) {

        int[] leftJoin = Arrays.copyOf(leftArray, leftArray.length + rightArray.length);

        for (int i = 0; i < leftArray.length; i++) {
            for (int j = 0; j < rightArray.length; j++) {
                if (leftJoin[i] == rightArray[j]) {
                    leftJoin[leftArray.length + i] = rightArray[j];
                }
            }
        }
        return leftJoin;
    }


    public static void main(String args[]) {
        int[] leftArray = new int[]{1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] res = new int[]{1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};


        Array array = new Array();
        int[] a = array.leftJoin(leftArray, rightArray);

         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(res));


    }

}
