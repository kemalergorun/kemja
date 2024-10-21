package Colecti;

import java.util.HashSet;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {
        //interview q
        //Store student email unique natural order
        //treeset cause natural order and unique
        long t1=System.nanoTime();
        TreeSet<String>stdEmails=new TreeSet<>();
        stdEmails.add("pq@gmail.com");
        stdEmails.add("ab@gmail.com");
        stdEmails.add("xy@gmail.com");
        stdEmails.add("dgh@gmail.com");
        stdEmails.add("lmn@gmail.com");
        System.out.println(stdEmails);
        long t2=System.nanoTime();
        System.out.println("exec time of treeset:"+(t2-t1));
        //2nd way hashset to speedy way then tree set
        long t3=System.nanoTime();
        HashSet<String>emailHs=new HashSet<>();
        emailHs.add("pq@gmail.com");
        emailHs.add("ab@gmail.com");
        emailHs.add("xy@gmail.com");
        emailHs.add("dgh@gmail.com");
        emailHs.add("lmn@gmail.com");
        System.out.println(emailHs);
        TreeSet<String>emailTs=new TreeSet<>(emailHs);
        System.out.println(emailTs);
        long t4=System.nanoTime();
        System.out.println(t4 - t3);
        //in real life you must first hashset than tree set



    }
}
