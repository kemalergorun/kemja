package Calısma3;

public class Instance3 {
    //siyah renkli ve benzinli oto ayarla
    public String color;


    public String fuelType;
    //instance block objede otomatik çalışır
    {
        color="siyah";
        fuelType="benzin";

    }
    public Instance3(){
        System.out.println("araba rengi  " + color);
        System.out.println("araba yakit  " + fuelType);
    }
    //default başlatmak istemezsek parametreli kullanırız


    public Instance3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
