package Calısma1;

public class Stringb2 {
    public static void main(String[] args) {
        //reverse sb objectte kullanılır ters çevirir
        StringBuilder sb1=new StringBuilder("Java is easy");
        sb1.reverse();
        System.out.println(sb1);
        //-------------------------------
        //deletecharat indexte bulunan charı siler
        sb1.deleteCharAt(1);
        System.out.println(sb1);
        //delete belirtilen aralık kaakteri
        sb1.delete(0,2);
        System.out.println(sb1);
        //replace int start dahil int end hariç
        //belirtilen indexte karakteri siler
        sb1.replace(0,2,"hasan");
        System.out.println(sb1);
        //--------------------------------
        //insert belirtilen konumdan ekler
        sb1.insert(2,"34");
        System.out.println(sb1);
        //compare to iki sbyi karşılaştırır
        //int değeri ikisi eşitse 0 döner
        //birinci önce ise - sonra ise + dönderiri
        StringBuilder sb2=new StringBuilder("Zava");
        StringBuilder sb3=new StringBuilder("Kava");
        int result=sb2.compareTo(sb3);
        System.out.println(result);
        //-----------------------------------------
        //tostring sb yi stringe dönüştürür
        String str=sb1.toString().toUpperCase();
        System.out.println(str);

        //string nasıl sbye çevrilir
        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);
        //-------------------------------------
        //String buffer string ureten başka bir class
        //mutable string olusturur//multi thread çoklu iş parçası
        //string buffer multithread ama sb değil
        //sb olmadığı için daha hızlı çalışır
        //multi thread yapılırken işlerin sıralanması gerekir,
        //syncronization sıraya koymaktır
        //string buffer multi thread olduğu için syncronized dır
        //ımmutable string class kullan
        //mutable string buffer multi thread kullanırsa
        //mutable string builder multi thread olmaycaksa
        //-------------------------------------------
        //stringbuffer oluşturma
        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);
        //single thread tek iş parçacığı string builder ofiste çalışan 1 kişi
        //multi thread birden fazla iş yapılır ama sıralamak gerekir
        //fabrika çalışanları fabrikada birden fazla iş
        //single tek basit işlerde string builder
        //çoklu multi işlerde multi kullanılır


    }
}
