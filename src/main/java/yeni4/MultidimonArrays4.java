package yeni4;

import java.util.Arrays;

public class MultidimonArrays4 {
    public static void main(String[] args) {
        //create multiarray
        //non flexible
        int[][] arr = new int[3][2];
        //print
        System.out.println(Arrays.deepToString(arr));
        //assigning values
        arr[0][0] = 8;
        arr[1][0] = 23;
        arr[0][1] = 7;
        arr[2][1] = 14;
        arr[2][0] = 2;
        arr[1][1] = 56;
        System.out.println(Arrays.deepToString(arr));
        //------------------------------------
        //print specific element fourth
        System.out.println(arr[1][1]);
        System.out.println(arr[0][1]);
        //flexible arrays
        String languages[][] = new String[4][];
        languages[0] = new String[]{"english", "chinese"};
        languages[1] = new String[]{"java", "pit", "c++", "sql"};
        languages[2] = new String[]{"spa", "tur", "fre"};
        languages[3] = new String[]{"script"};
        System.out.println(Arrays.deepToString(languages));
        //------------------------------------------------
        for (String[] innerArray : languages) {
            if (innerArray == null) {
                continue;
            }

            //-------------------------------------------------


            for (String w : innerArray) {
                System.out.println(w);
            }
            //flexible








            }
        }
    }

