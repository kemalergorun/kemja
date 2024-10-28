package Calısma2;

import java.time.LocalDate;

public class StaticBlock {
    //bir variable oluşturup değer atamazsanız onu initialize etmedin
    static double pi;
    //
    static int price;
    static {
        System.out.println("static block 2");
        LocalDate currentDate=LocalDate.now();
        if (currentDate.getMonthValue()==10){
            price=1000;
            System.out.println(price);
        }else {
            price=2000;
            System.out.println(price);
        }
    }
    static {
        pi=3.14;
        System.out.println("static block 1");
    }

    public static void main(String[] args) {
        //static block bir classın yüklenmesi sırasında otomatik çalışan
        //class başlaması ve başlangıç ayarı yapan özelliktir
        //statik blok yalnız bir kez çaılşır
        //veritabanı blok için kullanılır
        //veritabanı bağlantısı için bağlantının hızlı olmasını sağlar

        System.out.println(pi);
        System.out.println("main metod içi");
        //önce statik blok çalışır yeri önemli değil



    }
}
