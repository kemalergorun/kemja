package yeni1;

public class Prac3 {
    public static void main(String[] args) {
        // üçten fazla durum varsa switch kullan
        String dayName="cumartesi";
        if (dayName.equalsIgnoreCase("pazartesi")){
            System.out.println(1);

        } else if (dayName.equalsIgnoreCase("salı")) {

            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("çarşamba")) {

            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("perşembe")) {

            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("cuma")) {

            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("cumartesi")) {

            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("pazar")) {

            System.out.println(7);
        }else{
            System.out.println("geçerli gün gir");
        }
        switch (dayName){
            case "pazartesi":
                System.out.println(1);
                break;
            case "salı":
                System.out.println(2);
                break;
            case"çarşamba":
                System.out.println(3);
                break;
            case"perşembe":
                System.out.println(4);
                break;
            case"cuma":
                System.out.println(5);
                break;
            case"cumartesi":
                System.out.println(6);
                break;
            case"pazar":
                System.out.println(7);
                break;
            default:
                System.out.println("geçerli gün gir");







        }


    }
}
