package yeni1;

public class Prac10 {
    public static void main(String[] args) {
        String s="learn java earn 1234 money";
        //money i dollar yap
        //replace 2. parametredekini birinci yerine koyar
        String s1=s.replace("money","dollar");
        System.out.println(s1);
        //---------------------------------------------
        //s strigdeki e leri sil
        String s2=s.replace("e","");
        System.out.println(s2);
        //--------------------------------------------------
        //regular expression düzenli ifade regex
        String k="Kemal ERgorun";

        // s string de tum rakamları * yap
        String s3=s.replaceAll("[0-9]","*");
        System.out.println(s3);


    }
}
