package yeni1;

public class Prac15 {
    public static void main(String[] args) {
        //parola en az bir karakter içermeli
        //sadece space olmamalı
        //baş ve sonda boşluk olmamalı
        String pwd ="a";
        boolean first=pwd.isEmpty();
        //System.out.println(first);
        boolean second=pwd.isBlank();
        //System.out.println("second = " + second);
        //başındaki ve sonundaki boşlukları al eğer değer ilk haline eşit
        //orjin boşluk yok
        boolean third=pwd.trim().equals(pwd);
        //System.out.println("third = " + third);
        if (first){
            System.out.println("parola hiçbişey yazmadan geçilmez");
        }
        if (second){
            System.out.println("parola boş bırakılamaz boşluk hariç karakter koy");

        }
        if (!third){
            System.out.println("parola başına ve sonuna boşluk konulmaz");
        }


    }
}
