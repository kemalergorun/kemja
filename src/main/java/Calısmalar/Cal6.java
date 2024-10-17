package Calısmalar;

import java.util.ArrayList;

public class Cal6 {
    public static void main(String[] args) {
        //string array yap"a" içereni sil
        ArrayList<String>il=new ArrayList<>();
        il.add("manisa");
        il.add("niğde");
        il.add("tokat");
        il.add("van");
        System.out.println(il);
        //for (String w:il){
           // if (w.contains("a")){
             //   il.remove(w);
        for (int i = 0; i <il.size() ; i++) {
            if (il.get(i).contains("a")){
                il.remove(i);
                i--;
            }
        }System.out.println(il);
        
        
        
        
        
        

            }
            
            
            
            
            
            
            
        }
      //  System.out.println(il);

    //***hata eleman silme işleminde for each kullanılmaz****
    
    
    
    
    


