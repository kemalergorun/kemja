package yeni6;

public class MetodCreation5 {
    public static void main(String[] args) {
        //varargs
        // varying arguments
        //flexible number of parameters create varargs
        //syntax we write data type ... space name of variable
        //int ... a infinite possibility
        //varargs work in array
        //and used with pri and non primitive
        //rules: more than one variables can be used in the method
        //varargs but they must be at the end
        //varargs can have zero or single value
        //varargs can accept unlimited num of elements
        System.out.println("sum() = " + sum());
        System.out.println(sum(2, 4, 6, 8, 9, 10));


    }
    public static int sum(int... a){
        int total=0;
        for (int w:a){
            total+=w;

        }
        return total;

    }
}
