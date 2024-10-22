package Calısma1;

public class Stringbuild {
    public static void main(String[] args) {
        //string builder string üretir
        //string immutable ama builder mutable dir
        //mutable orjinal değiştirlebilir
        //met,n üzerinde sık değişiklik için builder kullanılır
        //append delete insert replace metodları kullanılır
        String s="java";
        String t=s+"x";
        String w=t+"?";
        //bir string variable ile concat ile yeni obje oluşur orjin değişmez
        //aynı değerler için string pool oluşturulur
        //aynı adersteki stringler == eşittir
        //ama yeni obje oluşturulursa false eşit olmaz equals veri kontrol eder
        //compile time runtime iki yürüme
        //runtime aynı anda çalışır new yani obje ile çalışır
        //compile time yazıldığı sırada çalışır pool kullanılır çünkü hızlı
        //bellek verimliliği ama sabit immutable olduğu için esneklik yok
        //dezavantaj
        StringBuilder sb1=new StringBuilder("python");
        System.out.println(sb1);
        sb1.append(" java");
        System.out.println(sb1);
        //mutable yani değiştirilebilir sürekli değişikler builder kullan
        //stringi değiştirdikten sonra eski değer garbage atılır****
        String a="money";
        a=a+"more";
        //money garbage olur çöpe gider artık money more kullanılır****
        //garbage collector bağımsız jvm ne zaman isterse çalışır





    }
}
