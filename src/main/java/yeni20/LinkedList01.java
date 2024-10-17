package yeni20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();//conc class construc
        List<String>list2=new ArrayList<>();
        //interface has no constructor
        List<String>list3=new LinkedList<>();
        List<String>mylist=new LinkedList<>();
        mylist.add("ali");
        System.out.println("mylist = " + mylist);
        //linkedlist got node has 2 parts
        //data and pointer and has got no index
        mylist.add("ayse");
        System.out.println("mylist = " + mylist);
        //head-node-node-tail
        //head> ali>ayse>tail
        mylist.add(1,"veli");
        System.out.println("mylist = " + mylist);
        mylist.addFirst("tom");
        System.out.println("mylist = " + mylist);
        mylist.addLast("emily");
        System.out.println("mylist = " + mylist);
        List<String>classList=new LinkedList<>();
        classList.add("betul");
        classList.add("kemal");
        classList.add("ceylin");
        System.out.println("classList = " + classList);
        mylist.addAll(classList);
        System.out.println("mylist = " + mylist);
        mylist.addAll(1,classList);
        System.out.println("mylist = " + mylist);
        mylist.remove(4);
        System.out.println("mylist = " + mylist);
        mylist.remove("ayse");
        System.out.println("mylist = " + mylist);
        mylist.removeAll(classList);
        System.out.println("mylist = " + mylist);
        mylist.removeFirst();
        System.out.println("mylist = " + mylist);
        mylist.removeLast();
        System.out.println("mylist = " + mylist);
        LinkedList<String>l2=new LinkedList<>();
        l2.add("fatma");
        l2.add("kemal");
        l2.add("junaid");
        l2.add("fatma");
        l2.add("junaid");
        l2.add("fatma");
        System.out.println("l2 = " + l2);
        l2.removeFirstOccurrence("junaid");
        l2.removeLastOccurrence("fatma");
        System.out.println("l2 = " + l2);


    }
}
