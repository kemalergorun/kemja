package Calısmalar;

public class Cal9 {
    public static void main(String[] args) {
        //main metod içinde başka metod oluşturulamaz
        //ancak main içinde class oluşturulursa inner class olur ve
        //metod oluşturulur
        //main dışı metod oluşur
        //main sade olmalı dinamik ve hız için
        //genelde runner classta main olur
        int sum=toplama(3,5);//args argumanlar main içinde
        System.out.println(sum);
        //1-metod call 2-dönen sonucu saklama

    }
    //metod oluşturma main dışı class içi oluşur
    //*****access modifier+return type+method name()+{}****METOD YAZMA
    //main içinden method call yapılır çalıştırılır
    //toplama yapan metod
    public static int toplama(int a,int b){//int a b parametredir
        return a+b;//çağrıldığı yere call olur


    }




}
