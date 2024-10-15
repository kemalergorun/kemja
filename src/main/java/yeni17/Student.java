package yeni17;

public class Student {
    private String name="henry";
    private int age=15;
    private boolean isSucces=true;
    //we use getter methods to see some and only for read only
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSucces() {
        return isSucces;
    }
    //we use setter to allow update

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSucces(boolean succes) {
        isSucces = succes;
    }
}
