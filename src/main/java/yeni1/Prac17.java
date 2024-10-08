package yeni1;

public class Prac17 {
    public static void main(String[] args) {
        //ilk a harf önceki tüm characterleri yazdır
        //tramvay
        String s="tramvay";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(s.charAt(i));
            System.out.println("");
        }
        //------------------------------------
        //stringde küçük harfleri konsola yazdırma
        //Pwd12?Ab
        String s1="Pwd12?Ab";
        for (int i = 0; i < s1.length(); i++) {
            char ch1=s1.charAt(i);
            if(ch1>='a'&& ch1<='z'){
                continue;//işlem yapma
            }else{
                System.out.print(ch1);
            }


        }






    }
}
