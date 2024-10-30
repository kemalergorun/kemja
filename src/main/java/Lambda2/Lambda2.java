package Lambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("Ronaldinho");
        myList.add("Messi");
        myList.add("Zidane");
        myList.add("Torres");
        myList.add("Torres");
        myList.add("Yamin");
        myList.add("Pelinovich");
        myList.add("Maldini");
        myList.add("CR7");
        myList.add("ArdaGüler");
        System.out.println("myList = " + myList);
        printElements(myList);
        System.out.println("-----------------------------");
        printElements1(myList);
        System.out.println("---------------------");
        sortedByLastChar(myList);


    }//create metod print all elements uppercase inthe same line space
    public static void printElements(List<String>list){
        list.stream().map(t->t.toUpperCase()).forEach(Utils::printWithSpace);

    }//create method unique elements lowercase and sorted
    public static void printElements1(List<String>list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(String::length)).forEach(Utils::printWithSpace);
        //comprator compare to length of elements and insertion order


    }//create a method to sort unique elements according last char
    public static void sortedByLastChar(List<String>list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printWithSpace);
    }//sorted use string in order







}
