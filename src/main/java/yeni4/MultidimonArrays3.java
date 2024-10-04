package yeni4;

import java.util.Arrays;

public class MultidimonArrays3 {
    public static void main(String[] args) {
        int[][] numbers = {{5, 4, 6}, {8, 3}, {1, 7, 9}};
        //System.out.println(Arrays.deepToString(numbers));

        int totalNumberelements = 0;

        for (int[] w : numbers) {
            // System.out.print(Arrays.toString(w));
            totalNumberelements = totalNumberelements + w.length;


        }
        System.out.println("totalNumberelements = " + totalNumberelements);
        int[] singleArray = new int[totalNumberelements];
        // using nested for each elements out
        int index = 0;

        for (int[] outer : numbers) {
            for (int each : outer) {
                singleArray[index] = each;
                index++;
            }
        }
        System.out.println("singleArray = " +Arrays.toString( singleArray));

    }}
