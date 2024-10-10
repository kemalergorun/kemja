package yeni10;

public class StrBuild3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java is object oriented language");
        System.out.println(sb);
        //replace method
        sb.replace(0,4,"Phyton");
        System.out.println(sb);
        //delete mode
        sb.delete(0,6);
        System.out.println(sb);
        //delete charat
        sb.deleteCharAt(0);
        System.out.println(sb);
        //insert method skips the given number after that
        sb.insert(3,"sql ");
        System.out.println(sb);


    }
}
