package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda6 {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("Natalia");
        myList.add("Ali");
        myList.add("Rumeysa");
        myList.add("Hasibullah");
        myList.add("Kemal");
        myList.add("Ali");
        myList.add("rumeysa");
        System.out.println("myList = " + myList);
        printElements(myList);
        System.out.println("--------------------");
        elementsGreater6(myList);
        System.out.println("--------------------------------");
        elementsGreter5Upper(myList);
        System.out.println("-------------------");
        uniq(myList);


    }
    //create a method print except r orR
    public static void printElements(List<String>list){
        list.stream().filter(t->!t.startsWith("R")&&!t.startsWith("r")).forEach(t-> System.out.println(t));
    }
    //create method with unique elements and number of characters is greater 6
    public static void elementsGreater6(List<String>list){
        list.stream().distinct().filter(t->t.length()>6).forEach(t-> System.out.println(t));
    }
    //create list as follows
    //must contain elements is greter than 5
    //must all converted uppercase
    //than list this
    public static List<String> elementsGreter5Upper(List<String>list){
     return    list.stream().filter(t->t.length()>5).map(t->t.toUpperCase()).toList();

    }
    public static void uniq(List<String>list){
            list.stream().sorted().map(String::toLowerCase).distinct().toList().forEach(t-> System.out.print(t+" "));
    }
    public static void removeIf(List<String>list){
        list.removeIf(t->t.length()>7);

    }

}
