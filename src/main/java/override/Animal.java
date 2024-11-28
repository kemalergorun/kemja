package override;

public class Animal {
    //oop nesne tabanlı programlama
    //gerçek hayatta birçok nesnenin objenin bilgisayara aktarılması
    //obje rengi yılı durumu ismi bilgidayarda göster
    //********----******++++********önemli**********++++*****
    //obje oluşturma bir class içinde toplanır tüm projelerde kullanılır
    //class 1 kez oluştu mu uzun kodlar tekrar yazılmaz
    //substring bir kez yazılmış ama herzaman kullanılır
    //uzun yazılmaz geliştirilme süreci kısalır
    //birbirinden bağımsız objeler gizlilik sağlar
    //classlar sayesinde tüm projelerde değişiklik yerine sadece
    //class değişir zaman kaybı azalır
    //ooop 4 özellik
    //1 inheritance
    //2 polymorphism
    //3 encapsulation
    //4 abstraction
    //-----------------------------*****************
    //1.inheritance
    //bir classtan diğer classa özellik gönderir
    //extends kullanılır
    //kodun yeniden kullanılmasına yarar
    //zaman emek tasarrufu
    //kolay update edebilme
    //classlar küçülür
    //daha az geliştirme ve bakım maliyeti
    //parent veya super class diye geçer child class subclass diye geçer
    //static metod override edilemez variable da edilmez
    //static metod overload edilir
    //final işaretlenen metod override edilemez
    //final üzerinde hiçbir işlem yapılamaz

    public void eat(){
        final double pi=3.14;
        System.out.println("animals eat");
    }
    public Animal create(){
        return new Animal();//yeni animal obje üretip animal datatip verdim
    }
    //parnt int veri tipi metod aç child override edersek
    public int add(int a,int b){
        return a + b;
    }
    //parentta class veri türü aç override et
    public Integer carpma(Integer a,Integer b){
        return a*b;
    }


    public void drink()
    {
        System.out.println("animals drink");
    }
    //poly morphism çok biçimlilik demektir bir metodu farklı şekilde
    //çaışltırmak için kullanılır
    //iki çeşit overload ve over ride
    //over load tek class override parent tan child e gider
    //over ride daha spesifik bastırma
    //override anitasyonu yazmak zorunlu değil

    //private override edilemez çünkü farklı classla olmaz
    //child accesi parentten dar olamaz
    //aynı seviye ve geniş olabilir liskovun yerine geçme




}
