package Calısma2;

public class Stud1 {
    //static bir değişkenin veya metodun classa ait olduğunu ve
    //classın bir objesi olmadan kullanılabileceğini belirtir
    //static değer değişirse her obje etkilenir
    //static variable ve metodlar class member tüm objeler için ortak
    //static memberlar classa , non static olanlar objeye ait
    //static class memberlere ulaşamada objeye gerek yok
    //non static ulaşmak için obje oluşturulmalı
    //static variable class veriable non static obje yada instance variable
    public static String studName="ali can";
    public int age=18;
    public static void staticMethod(){
        System.out.println("ben static metodum");

    }
    public void nonStaticMethod(){
        System.out.println("ben nonstatic metodum");
    }



}
