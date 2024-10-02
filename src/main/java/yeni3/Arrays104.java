package yeni3;

import java.util.Arrays;

public class Arrays104 {
    public static void main(String[] args) {
        double prices[]=new double[5];
        prices[0] = 12.68;
        prices[1] = 24.90;
        prices[2] = 9.99;
        prices[3] = 78.50;
        prices[4] = 10.99;
        System.out.println(Arrays.toString(prices));
        double sum=0;

        for (double w:prices){
            sum=sum+w;

        } System.out.println(sum);













    }
}
