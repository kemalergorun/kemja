package yeni3;

import java.util.Arrays;

public class Arrays103 {
    public static void main(String[] args) {
        String countries[]={"turkiye","uk","germany","bulgaria","spain"};

        System.out.println(Arrays.toString(countries));

        // to order sort metod
        //string alphabetical
        //num ascending
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
        //-----------------------------
        String names[]={"ali","kemal","ceylin","betül","feyzullah"};
        System.out.println(Arrays.toString(names));
        for (String w:names){
            if (w.length()<6){
                System.out.println(w);

            }



            }




        }







}
