package Calısmalar;

import java.util.ArrayList;

public class Cal4 {
    public static void main(String[] args) {
        //arraylist dinamik array yapısıdır boyutu ekleme ve çıkarma sırasında
        //flexible alışveriş listesi string tipidir class tır
        //array prim ve reference list reference depolar
        //list daha fazla memory kaplaR
        //array eleman sayısı ver list de esnek
        //array çok daha hızlıdır
        //az yer kaplAR sayı belirlemek
        //list yalnızca referans kullanabilir
        //list classtır <>generic türler kullanır
        //arraylist oluşturma
        ArrayList<Integer> ages=new ArrayList<>();//type inference
        //eleman ekleme
        //add metodu ile elemanı sona ekler
        //mevcut eleman sağa kayar
        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages);
        ages.add(1,28);
        System.out.println(ages);
        ages.add(3,7);
        System.out.println(ages);
        ages.add(11);
        System.out.println(ages);
        //verilen integer listi arrayliste ekleyin
        //addAll metodu bi koleksyondaki tüm öğeleri ekler
        //diğer öğeler sağa kaydırılır
        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        ages.addAll(newAges);
        System.out.println(ages);
        System.out.println(newAges);
        ages.addAll(0,newAges);
        System.out.println(ages);
        //size metodu öğelerin sayısını gönderir
        int elemsa=ages.size();
        System.out.println(elemsa);


    }
}
