package yeni4;

public class MultidimonArrays1 {
    public static void main(String[] args) {
        //find the longest array
        String[][] str={
                {"apple","banana","kiwi"},
                {"Manchester United","Arsenal","Liverpool"},
                {"iphone","galaxy note","huawei","nova"}
        };
        String longestElement="";
        for (String[] eachArray:str) {
            //System.out.println("eachArray.length = " + eachArray.length);
            for (String element : eachArray) {
                if (element.length() > longestElement.length()) {
                    longestElement = element;
                    //System.out.println("element.length() = " + element.length());
                }
            }




        }System.out.println("longestElement = " + longestElement);
    }
}