package Exceptions;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Except10 {
    public static void main(String[] args) {

        checkGrade(10);
        System.out.println(checjNameFormat("Kem"));


    }//create method to show grade

    public static void checkGrade(int grade){
        if (grade<0||grade>100){
            try {
                throw new InvaldStudentGrade("grades cant be lessthan 0 and more than 100");
            } catch (InvaldStudentGrade e) {
                e.printStackTrace();
                System.out.println("its not an exception");
            }
        }else{
            System.out.println("grade = " + grade);
        }
    }
    public static boolean checjNameFormat(String name){
        if (name.charAt(0)>'A'&& name.charAt(0)<'Z'){
            return true;

        }else {
            throw new IllegalArgumentException("names must uppercase");

        }
    }
}
