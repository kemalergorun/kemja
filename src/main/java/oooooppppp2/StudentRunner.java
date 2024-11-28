package oooooppppp2;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.getAge());
        System.out.println(s.isSuccessful());

        //-------set-----///
        s.setAge(25);
        System.out.println(s.getAge());

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());
        //class ta obje değerleri değişmez
        //obje değerleri değişir
        //obje class ın kopyasıdır
        //orjinal kalıplar hiçbir zaman değişmez
        //set ile veriler değişir constructor ile değişir
        //set mevcut nesnenin verilerini değişitirir
        //constructor yeni obje başlangıç durumunu belirler
        //get ve set metodlarının olduğu classlar java bean olarak anılır
        //-----*****************----onemli----***********----
        //encaps bir obje oluştur iki obje gibi kullan
        //kalıptan istediğimiz kadar oluştururuz
        //memory problemi önlenir birçok obje memori doldurur






    }
}
