package OOOOPPPPPP1;

public class Car extends Vehicle{
    public Car() {
        super();//2
        System.out.println("sedan");
    }
    public Car(String tip){
        super("honda",2024,"elektrikli");
        System.out.println("sport");

         //parametreliler paramları çağırır
        // paramatresizler parametresizleri çağırır

        // aynı class ta consturoctorlar arasında gezinebilir yani classtan
        //hem sedan hem de sport üretime sokulur
        //aynı class ta cons arasında gezinmek için super sil this parametresiz
        //seçer this ve super ilk satırda olmalıdır bu yüzden ikisi bir arada
        //aynı consta kullanılamazlar


    }
}
