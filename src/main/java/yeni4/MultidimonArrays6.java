package yeni4;

public class MultidimonArrays6 {
    public static void main(String[] args) {
        int[][]numbers={{5,4,3},{8,2},{3,7,9}};


        int rownum=0;


        for (int[]outer:numbers){
            int sum=0;
            for (int each:outer){
                sum=each+sum;


            }
            rownum++;
            System.out.println("sum of "+rownum +".row "+ sum);
        }



    }

}
