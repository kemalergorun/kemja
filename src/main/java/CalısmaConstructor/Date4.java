package CalısmaConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Date4 {
    public static void main(String[] args) {
        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);
        //date time formatter stringe çevirir
        //ofpattern belli kalıba göre çevirir
        //format locali stringe çevirir
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm:ss ");
        String formattedTime= dtf1.format(myCurrentTime);
        System.out.println(formattedTime);
        //tarihi formatlayalım
        LocalDate myCurrentDate=LocalDate.now();
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate=dtf2.format(myCurrentDate);
        System.out.println(formattedDate);
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);
        //-----------------------------------
        //tum zonelar
        Set<String> zoneIds=ZoneId.getAvailableZoneIds();
        for (String zoneId:zoneIds){
            System.out.println(zoneId);
        }
        System.out.println(zoneIds.size());


    }
}
