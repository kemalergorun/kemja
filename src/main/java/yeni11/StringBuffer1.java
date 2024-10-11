package yeni11;

public class StringBuffer1 {
    public static void main(String[] args) {
        //string create class
        //is very similar to buılder.builder and buffer mutable
        //string buffer is multithreaded  builder single threaded
        //string builder faster
        //thread is the  smallest code that run
        //single threads execution is done sequentially one by one
        //in an order
        //multi thread run same time ,and it is very difficult to use
        //synchronisation logical sequence
        //stringbuffer thread safe because synchronisation

        StringBuffer sbf=new StringBuffer();
        //System.out.println(sbf);
        //-----------------------------
        sbf.append("We are learning stringBuffer");
        System.out.println(sbf);//stringbuffer data type
        String str=sbf.toString();
        System.out.println(str);//data type string
        str=str.toUpperCase();
        System.out.println(str);
        StringBuilder sb=new StringBuilder(str);
        System.out.println("sb = " + sb);
        StringBuffer sbf1=new StringBuffer(str);
        System.out.println("sbf1 = " + sbf1);


    }
}
