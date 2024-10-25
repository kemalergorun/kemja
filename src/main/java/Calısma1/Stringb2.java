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


    }
}
