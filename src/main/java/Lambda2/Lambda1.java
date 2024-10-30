package Lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda1 {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("Alexander");
        myList.add("Ali");
        myList.add("Yusuf");
        myList.add("Maryam");
        myList.add("Josef");
        myList.add("Shukrullah");
        System.out.println("myList = " + myList);
        removeElem(myList);
        System.out.println("------------------------");
        removeElem1(myList);
        System.out.println("------------------------------------");
        removeElem2(myList);


    }//create mthod delete the elements which start with "Y"and ends with "f"
    public static void removeElem(List<String>list){
        list.removeIf(t->t.startsWith("Y")&&t.endsWith("f"));
        System.out.println("list = " + list);
    }//create delete elements contain a
    public static void removeElem1(List<String>list){
        list.removeIf(t->t.contains("a"));
        System.out.println("list = " + list);

    }//create delete elem size between 4 and8 and ends w f
    public static void removeElem2(List<String>list){
        Predicate<String>condition=t->t.length()>4&&t.length()<8||t.endsWith("f");
        list.removeIf(t->condition.test(t));
        System.out.println("list = " + list);

    }

}
