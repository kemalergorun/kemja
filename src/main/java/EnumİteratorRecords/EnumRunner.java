package EnumİteratorRecords;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //System.out.println(Cities.ADANA);
        //System.out.println(Cities.valueOf("ADANA"));
        System.out.println(Cities.İSTANBUL.getCityName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter plate code");
        int plateCode = scanner.nextInt();


        Cities[] allvalues = Cities.values();
        if (plateCode < 0 || plateCode > 81) {
            System.out.println("enter valid plate code");
        } else {
            for (Cities w : allvalues) {
                if (plateCode == w.getPlateCode())

                    System.out.println(w.getCityName());
            }


        }
    }}
