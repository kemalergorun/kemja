package yeni1;

public class Prac12 {
    public static void main(String[] args) {
        // fiyat toplamları bul
        String tv="$456.99";
        String laptop="$875.99";
        //valueof stringi istenene çevirir
        tv=tv.replace("$","");
        laptop=laptop.replace("$","");
        Double sum=Double.valueOf(tv)+Double.valueOf(laptop);
        System.out.println(sum);
        //----------------------------------------
        //kullanıcı ilk harfleri buyut
        //trim string boşlukları siler baş sondaki
        //split stringi istediği yerden parçalar
        String name="    ali cAN    ";
        char first= name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);



    }
}
