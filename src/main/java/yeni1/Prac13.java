package yeni1;

public class Prac13 {
    public static void main(String[] args) {
      //belli bir string belli bir yere kadar kes ve yazdır bu daha doğru
      String a="abc@gmail.com";
      String company1=a.split("@")[1].split("\\.")[0];
        System.out.println("company1 = " + company1);
        //.2. yol
        //index of metodu ile ilk index numarasını veriri
        int starting=a.indexOf("@")+1;
        int ending=a.indexOf(".");
        String companyname=a.substring(starting,ending);
        System.out.println("companyname = " + companyname);


    }
}
