package CalısmaConstructor;

public class Car {
    //oop -object -pasif aktif özellikler
    //class -variable-method======object
    //***************obje oluşturmak böyle*************
    //****bir veri yapısı veya yardımcı class ta main met gerek yok
    //****ancak uygulama veya bağımsız bir program çalışırken main gerek
    //****projede real time sadece bir main class olur
    // bunada runner class denir
    //1-variable oluşturalım (pasif özellikler)
    String brand="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;
    //methodlar oluştur(aktif özellikler)
    public void hareket(){
        System.out.println(brand+" hızlı");
    }
    public void dur(){
        System.out.println(brand+" güvenli durur");
    }
    //constructor classtan obje oluşturan bölüm
    //class ta otomatik cons vardır
    //default tur car() diye geçer










}
