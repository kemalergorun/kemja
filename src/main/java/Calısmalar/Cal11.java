package Calısmalar;

public class Cal11 {
    public static void main(String[] args) {
        //polymorphism çok biçimlilik
        //metod overloading static poly+overriding dynamic poly
        //oop prensiplerinden biridir
        //metodu istediğimiz sonuç alcak şekilde farklı şekilde çalıştırma

        //overload çok iş yapan metod
        //overload aşırı yükleme
        //aynı metod ismi fakat farklı parametre
        //tek class içinde yapılır
        add(3,5);


    }
    //overload yapma******
    //toplama metodu yap ve overload et
    public static void add(int a,int b){
        System.out.println(a + b);
    }
    public static void add(double a,double b){
        System.out.println(a + b);}
    public static void add(double a,int b){
        System.out.println(a + b);}
    public static void add(int a,double b){
        System.out.println(a + b);}
    public static void add(int a,int b,int c){
        System.out.println(a + b+ c);}
    //küçük veriyi büyüğe çevirme java otomatik yapar auto widing denir
    //expilict narrowing açıktan daraltma bu otomatik olmaz kodcular yapar
    //++***METOD İSMİ+PARAMETRE =METOD SİGNATURE******
    //OVERLOADİNGTE SADECE PARAMETRE DEĞİŞİR
    //BÖYLECE İMZA DEĞİŞİR YENİ METOD OLUŞUR
    //OVERLOADDA
    //parametre sayısı değişir
    //parametre data tipi değişir
    //parametre data tipleri faklı ise parametrelerin yerleri değişir
    //overload da return type access mod ve static non static etki yoktur

    //class ismi ile çağrılan static
    //obje ile çağrılan non static metod

    //private ve static metodlar overload olur,çünkü private aynı classtır
    //overload yeni metod oluşturur











}
