package Calısma1;

public class Stringbuild1 {
    public static void main(String[] args) {
        //capacity ayrılan karakter alanı büyüklüğü
        //append yeni string eklemek
        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.append("java");
        sb2.append("xxxxxxxxxxxxxxx");

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//aşan capacity (csayısı*2)+2 bul
        //-------------------------------------------------



    }
}
