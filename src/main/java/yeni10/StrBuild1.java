package yeni10;

public class StrBuild1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("java");
        System.out.println("origi ="+sb);
        sb.append("!");
        System.out.println("sb = " + sb);
        //real life in banks customer detail to protected
        //immutable data should store password id name
        //withdrawals /deposits mutable
        //stringbuilder mutable
        //------------------------------------------
        StringBuilder sb1=new StringBuilder();
        sb1.append("java");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append(" is easy.");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append(" it is OOP.");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("12345678912345699");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


    }
}
