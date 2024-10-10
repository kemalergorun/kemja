package yeni9;

public class PassByValue1 {
    public static void main(String[] args) {

        //arrays arraylist and stringbuilder allow data manuplations
        String str="Java";
        System.out.println("str = " + str);

        modifyString(str);
        System.out.println("str after method = " + str);


    }
    public static void modifyString(String s){
        s=s.toUpperCase();
        //System.out.println("modifiedString = " + s);
    }

}