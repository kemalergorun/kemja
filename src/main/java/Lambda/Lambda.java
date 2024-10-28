package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        //lambda expressions introduced in java 8 functional programming
        //kendileri programming değil sadece oop destekliyor
        //isimsiz fonksiyonlar içerir ve kısa yol gibi adlandırılırlar
        //collections ve arraylar ile kullanılır
        List<Integer>numbers=new ArrayList<>(Arrays.asList(5,9,12,23,49,65));
         printElements(numbers);
        System.out.println("----------------");
        printElementsWithLambda(numbers);
        System.out.println("---------------------");
        printEvens(numbers);
        System.out.println("-------------------------");
        printEvensWithLambda(numbers);


    }
    //create a simple method
    public static void printElements(List<Integer>numb){
        for (Integer w:numb){
            System.out.print(w + "");
        }
    }
    public static void printElementsWithLambda(List<Integer>list){
        list.stream().forEach(t->System.out.print(t));
        //t receives each element one by one
        //t function name


    }
    public static void printEvens(List<Integer>list){
        for (Integer w:list){
            if (w%2==0){
                System.out.print(w + "");
            }

        }
    }
    public static void printEvensWithLambda(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t->System.out.print(t));

    }
}
