package yeni1;

public class Prac7 {
    public static void main(String[] args) {
        //verilen yılı "leap olup oladığı kontrol et"
      // yıl 100 e bolunurse 400 e bolunur
        // yıl 100 e bolunmuyorsa 4 e bolunur
        //(c) ? (t) : (F)
        int year =2007;

        String result=(year%100==0)?((year%400==0)?("year leap"):("year not leap)")):
                ((year%4==0)?("leap year"):("year not leap"));
        System.out.println(result);

    }
}
