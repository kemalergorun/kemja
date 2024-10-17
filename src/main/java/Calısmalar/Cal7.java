package Calısmalar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cal7 {
    public static void main(String[] args) {
        //**** interview sorusu****
        //bir int list oluştur en yakın iki tamsayı yazdır
        //12,23,10,19

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //iki türlü sort
        //arraylist içi ve collections içi sort
        //Collections.sort(nums);//timsort
        nums.sort(null);
        System.out.println(nums);
        int minFark= nums.get(1)- nums.get(0);
        for (int i = 1; i <nums.size() ; i++) {
            minFark=Math.min(minFark,nums.get(i)-nums.get(i-1));
        }
        System.out.println(minFark);
        //------------------------
        //en kucuk farkı hangi sayılardan elde ettik
        for (int i = 1; i <nums.size() ; i++) {
            //minfArkı hangi işlemde bulduğumuz
            if (nums.get(i)-nums.get(i-1)==minFark){
                System.out.println(nums.get(i)  + " ve " +  nums.get(i - 1));
            }


        }


    }
}
