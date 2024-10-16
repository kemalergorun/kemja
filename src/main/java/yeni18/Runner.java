package yeni18;

public class Runner {
    //abstraction methods small and atomic
    // and fast
    //****you cant create object from abstract***
    //we create abstract to catagorize child classes and all child class
    //must implement
    //abstract ghost method concrete real method
    //inheritance-over-riding-abstraction

    /*
    If there's a parent-child relation between an "abstract" and
    a "normal/concrete"
    class, the child class will show error UNTIL and UNLESS
    the abstract method is implemented.
    So the implementation of an "abstract" method is mandatory.
    */

    public static void main(String[] args) {
        Civic car1=new Civic();
        car1.engine();
        car1.music();
        Accord car2=new Accord();
        car2.engine();
        car2.music();




    }






}
