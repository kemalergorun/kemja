package EnumİteratorRecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator3 {
    public static void main(String[] args) {
        List<String> yourList=new ArrayList<>(Arrays.asList("apple","cherry","orange","fig","lychee"));
        System.out.println("yourList = " + yourList);
        ListIterator<String>yourlisti= yourList.listIterator();
        while (yourlisti.hasNext()){
            String element= yourlisti.next();
            if(element.equals("fig")){
                yourlisti.remove();

            }
            System.out.println("yourList = " + yourList);
            Employee employee1=new Employee("kem",123);
            System.out.println(employee1.employeenum());
            System.out.println(employee1.name());


        }
    }
}
