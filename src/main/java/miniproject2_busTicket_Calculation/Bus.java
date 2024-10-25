package miniproject2_busTicket_Calculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //bus number , seats
    public String busNum;
    public List<String> seats=new ArrayList<>();
    //constructor
    public Bus(String busNum){
        this.busNum=busNum;
        //for creating object in the seat numbers is avaible for every bus
        for (int i=1;i<33;i++){
            seats.add(i+"");

        }
    }






}
