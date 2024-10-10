package yeni10;

public class StrBuild4 {
    public static void main(String[] args) {
        //customize capacity
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder(5);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.append("custom");
        //capacity increased default*2+2
        //the upper limit
        //customize capacity



    }
}
