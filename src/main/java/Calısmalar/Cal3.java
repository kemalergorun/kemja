package Calısmalar;

public class Cal3 {
    public static void main(String[] args) {

        //int md de enkucuk ve ebuyuk bul topla
        int[][]ages={{15,4},{12,43,21}};
        int minimum=ages[0][0];
        int maximum=ages[0][0];
        for (int[]w:ages){
            for (int k:w){
                minimum=Math.min(minimum,k);
                maximum=Math.max(maximum,k);

            }
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum + minimum);



    }
}
