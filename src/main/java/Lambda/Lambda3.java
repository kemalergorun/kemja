package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda3 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(3,5,2,6,11,3,5));
        System.out.print(nums);
        System.out.println("--------------");
        //create a  method to calculate to total of elements
        sumOfElements(nums);
        System.out.println("--------------------------");
        sumOfElementsWithLambda(nums);
        System.out.println("-------------------------");
        sumOfElementsWithoutDuplicate(nums);
        System.out.println("---------------");
        sumOfOddEleWDuplicate(nums);
        System.out.println("------------------------");

        multiplyOfEvenwDup(nums);

    }
    public static void sumOfElements(List<Integer>list){
        int sum=0;
        for (Integer w:list){
            sum=sum+w;
        }
        System.out.println("sum = " + sum);


    }
    public static void sumOfElementsWithLambda(List<Integer>list){
        System.out.println(list.stream().reduce(0, (t, u) -> t + u));

    }
    //create method to get sum after duplicates
    public static void sumOfElementsWithoutDuplicate(List<Integer>list){
        System.out.println(list.stream().distinct().reduce(0, (t, u) -> t + u));
    }
    public static void sumOfOddEleWDuplicate(List<Integer>list){
        System.out.println(list.stream().distinct().filter(t -> t % 2 != 0).reduce(0, (t, u) -> t + u));
    }
    public static void multiplyOfEvenwDup(List<Integer>list){
        System.out.println(list.stream().distinct().filter(t -> t % 2 == 0).reduce(1, (t, u) -> t * u));

    }


}
