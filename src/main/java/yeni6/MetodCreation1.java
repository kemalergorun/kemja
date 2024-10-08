package yeni6;

public class MetodCreation1 {
    public static void main(String[] args) {
        //metod creation outside main
        //we create outside than call inside the main metod this metod call
        //Java provides us many methods from its library
        //math.max,substring index of get set ....
        //syntax: accesmodifier static ,return type ,name of metod(parametres)
        //{metod body}
        //if add return datatype you must return

        //method call
        System.out.println("Result = " + add(2, 7));


    }
    //create amethod to add integers
    public static int add(int a,int b){
        int result=a+b;
        return result;
    }
}
