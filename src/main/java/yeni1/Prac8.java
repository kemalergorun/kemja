package yeni1;

public class Prac8 {
    public static void main(String[] args) {
        //string data tipi (class)
        //çok önemli metodlar gerekli
        String s="java is easy";
         int slength=s.length();
        System.out.println(slength);//12
        //-----------------------------------
        //charat index bulur arrays string koleksyonlar için
        //length-1 son index
        char firstchar=s.charAt(0);
        System.out.println(firstchar);
        char lastchar=s.charAt(11);
        System.out.println(lastchar);
        char lastchar1=s.charAt(slength-1);
        System.out.println(lastchar1);



    }
}
