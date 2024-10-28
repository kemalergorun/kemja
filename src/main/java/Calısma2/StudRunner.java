package Calısma2;

public class StudRunner {
    public static void main(String[] args) {
        //örnek instance oluşturmak
        Stud ali=new Stud();
        System.out.println(ali.stdName);
        System.out.println(ali.email);
        System.out.println(ali.address);
        System.out.println(Stud1.studName);
        //static class üyelerine sadece class ismi yazmak yeterli
        Stud1 ali1=new Stud1();
        System.out.println(ali1.age);
        //non static için obje oluştu
        Stud1.staticMethod();//ben static metodum
        ali1.nonStaticMethod();
    }
}
