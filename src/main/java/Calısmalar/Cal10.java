package Calısmalar;

public class Cal10 {
    public static void main(String[] args) {
        //örnek çalıştırma
        int sonuc1=multiply(3,5);
        System.out.println(sonuc1);
        //ör2
        int sonuc2=multiplus(4,4,2);
        System.out.println("sonuc2 = " + sonuc2);
        //ör3
        write("kemal");

    }
    //iki sayıyı çarpan metod
    //protected bu class erişilebilir
    //miras alınan classlardan erişilir (extends)

    protected static int multiply(int a,int b){
        return a*b;
    }
    //3 sayı ilk iki çarpan üçüncü toplayan
    private static int multiplus(int a,int b,int c){
        return a*b+c;
    }
    //girilen kelimeyi konsole yazdır
    //eğer data üretmiyor ise void olur
    //void ise return olmaz
    public static void write(String str){
        System.out.println(str);
    }
    //








}
