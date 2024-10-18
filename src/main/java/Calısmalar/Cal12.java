package Calısmalar;

public class Cal12 {
    public static void main(String[] args) {
        int result=toplama(3,7,10);
        System.out.println("result = " + result);


        //varargs
    }
        public static int toplama(int...a) {
            int sum = 0;
            for (int w : a) {
                sum = sum + w;
            }
            return sum;
    }
//varargs bir metodun değişken sayıda arguman almasını sağlar
    //-birden fazla varargs kullanılmaz
    //-her zaman son karakter olmalıdır
    //-arka planda array kullanır
    //-primit ve non primit olabilir
    //-aynı türde birden fazla arg olabilir
    //-sıfır arg olabilir


}
