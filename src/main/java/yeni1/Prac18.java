package yeni1;

public class Prac18 {
    public static void main(String[] args) {
        //verilen string tersden yazan kod
        //son index her zaman length()-1 dir
        String t="Ali Can";
        String ters="";// ters data saklanacak
        for (int i =t.length()-1; i>=0 ; i--) {
            ters=ters+t.charAt(i);
            //ters=ters+t.substring(i,i+1);
        }
        System.out.println(ters);
        //---------------------------------
        //tamsayı rakamları toplamı yazdır

        int sum=0;
        for (int i=578;i>0;i=i/10){
            sum=sum+i % 10;
        }
        System.out.println("sum = " + sum);
        //-----------------------------------------
        //tekrar olmayan karakteri yaz bir stringde
        //yusuf=ysf





    }
}
