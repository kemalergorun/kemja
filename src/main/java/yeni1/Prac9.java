package yeni1;

public class Prac9 {
    public static void main(String[] args) {
        //substring index aralığı sub döndürür
        //substring(0,4)= 0 dahil 4 hariç
        String s="java is easy";
        String sub1=s.substring(0,4);
        System.out.println(sub1);
        //---------------
        String sub2=s.substring(5,7);
        System.out.println(sub2);
        //------------------------------
        //tek parametre başlar sona kadar
        String sub3=s.substring(8);
        System.out.println(sub3);
        //---------------------------------
        //contains metodu true fals döner stringde karakter kontrol eder

        boolean isexist=s.contains("easy");
        System.out.println(isexist);

        //---------------------------------------
        //startsWith string ilk karakteri boolean döner
        boolean isstart=s.startsWith("java");
        System.out.println(isstart);
        //-----------------------------------------
        //endswith son karakter kontrol boolean döner
        boolean isend=s.endsWith("easy");
        System.out.println(isend);
        //-------------------------------------------



    }
}
