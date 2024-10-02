package yeni3;

import java.util.Arrays;

public class Arrays101 {
    public static void main(String[] args) {
        String[] citynames=new String[7];
        citynames[0]="yozgat";
        citynames[1]="ankara";
        citynames[2]="çorum";
        citynames[3]="istanbul";
        citynames[4]="sinop";
        citynames[5]="mardin";
        citynames[6]="hakkari";
        System.out.println(Arrays.toString(citynames));

        for (int i=0;i< citynames.length;i++){
            String cityname=citynames[i];
            System.out.println("cityname="+ cityname);
        }

        for (String w:citynames){
            System.out.println("cityname= "+w);
        }










    }
}
