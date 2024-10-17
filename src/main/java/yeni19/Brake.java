package yeni19;

public interface Brake {
    void abs();
    void esp(int a);
    void run();
    //we can create a regular method
    //we can use two keyword static or default to begin concrete
    public static void speed(){
        System.out.println("180 km per hour");
    }
     public default void power(){
        System.out.println("i am fine here");
        log();

    }
    //private method is allowed in interface
    private void log(){
        System.out.println("private used");
    }


}
