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
    //constructor sağ tarafta yer alır
    //car class bize hep aynı değeri dönderir
    //eğer kendi cons oluşursa java defaultu siler

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    //****constructor nasıl oluşur
    //access modifier +class ismi+()+{}
    //metod ile cons arası fark
    //-methodlar return type var cons yok
    //-metod yaptığı işe göre isim alır cons sadece class ismi alır
    //-metod aksiyon yapar iş yapar.cons sadece obje oluşturur
    //-metod kucuk harf cons ise buyuk harf ile başlar çünkü class ismi
    //ile aynı. parametreli conslar oluşturarak aynı classtan farklı
    //özelliklere sahip obje oluşur
    public Car(String brand,String model,int year,boolean hybrid) {
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;


    }
      public Car(String brand,String model){
        this.brand=brand;
        this.model=model;

      }




















}
