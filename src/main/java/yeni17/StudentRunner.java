package yeni17;

public class StudentRunner {
    public static void main(String[] args) {
        Student student=new Student();//cover with private its encapsulated
        //its very important
        //because we must hide some data
        System.out.println(student.getName());
        System.out.println(student.isSucces());
        System.out.println(student.getAge());
        student.setName("herry");
        System.out.println(student.getName());
        student.setAge(14);
        System.out.println(student.getAge());
        student.setSucces(false);
        System.out.println(student.isSucces());


    }
}
