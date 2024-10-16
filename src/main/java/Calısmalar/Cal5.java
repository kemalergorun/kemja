package Calısmalar;

import java.util.ArrayList;

public class Cal5 {
    public static void main(String[] args) {
        //get index arraylistde index elemanı getirir
        //set metodu verilen ögeyi yeni ile değiştirir
        //ınt arraylist oluştur tekleri 11 yap
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(23);
        list1.add(24);
        list1.add(12);
        list1.add(9);
        list1.add(3);
        System.out.println(list1);
        //index of metodu bir arraylist içindeki bulur yoksa - verir
        for (Integer w :list1) {
        if(w%2!=0){
            list1.set(list1.indexOf(w),11);
        }
        }
        System.out.println(list1);


    }
}
