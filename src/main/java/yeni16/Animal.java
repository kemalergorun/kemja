package yeni16;

public class Animal {
   public static int price;
  public final int year=12;//final cant create without assign





    public void eat() {
        System.out.println("animals eat");
    }
    public void drink(){
        System.out.println("animals drink");

    }
    public int add(int a,int b){
        return a+b;//prim data type



    }
    public Animal create(){
        System.out.println("classes use as datatypes");
        return new Animal();//return without using memory
    }
    public Number multiply(int a,int b){
        return a*b;

    }


}
