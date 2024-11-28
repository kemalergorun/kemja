package oooooppppp2;

public class Student {
    //encaps veri saklama
    //oop mantğında class uyelerine erişimi sınırlandır
    //getter ve setterlar ile yapılır
    /*
    //read ve write ayrı yapılır
    //istediğne write isteyene read verir
    //data modi private yapılarak saklanır
    //get verilerek data okunabilir
    //set değiştirlebilir
    //hem okunsun hem yazılsın istersen getter ve setter olur
    */
    public String name="ali can";
    private int age=13;
    private boolean successful=true;
    // age ve suc datalarını okunabilir yapalım.getter okuma yapar
    //getter parametre almaz setter parametre alır
    public int getAge() {
        return age;
    }

    public boolean isSuccessful() {
        return successful;
    }
    //age ve suc dataları değiştirl
    //setter ile değiştirebiliriz
    //setter yeni data vermez değiştirir return lar hep voiddir(fluent api değil)
    //setter private elemanlara değer atadığı için parametre alır


    public void setAge(int age) {
        this.age = age;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    //set ve get static olmaz
    //classlar static olur




}
