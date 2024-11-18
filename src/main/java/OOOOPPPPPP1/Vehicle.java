package OOOOPPPPPP1;

public class Vehicle {
    //javada bir sınıf herhangi bir constructor açıkça tanımlanmamışsa
    //java o sınıfa ait bir varsayılan constructor ekler
    //bu parametrezsizdir ve classın kendisine aittir
    //object ata classtır ve tüm classlar object classta metoda ulaşır
    //tostring equals hashcode gibi
    //++------------------------******************
    //child class ta bir obje oluşursa constructor parenttan alta doğru
    //çalışır*********önemli****************
    //son kurtulma
    //cons oluştur
    //parametresizler default ve no arguman
    //parametreliler super içine parametre eklenir
    //public sınıf ismi içine parametre girilir

    public Vehicle(){
        super();//3
        System.out.println("honda,2023,benzin");

    }
    public Vehicle(String marka,int yıl,String motor){
        super();
        System.out.println("honda,2024,elektrikli");
    }








}
