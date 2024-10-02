package yeni3;

import java.util.Arrays;

public class Arrays105 {
    public static void main(String[] args) {
        int ages[]={12,6,9,18,22,15};
        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);
        System.out.println("after sorting:" +Arrays.toString(ages));
        // get max and min age
        // we can use index 0 minumum after sorting
        //we can last index maximum value length-1
        int minage=ages[0];
        int maxage=ages[ages.length-1];

        System.out.println(minage);
        System.out.println(maxage);
        //--------------------------
        int grades[]={59,67,99,20,70,85};
        System.out.println(Arrays.toString(grades));

        int minGrade=grades[0];
        int maxGrade=grades[0];

        for (int w : grades){
            minGrade=Math.min(w, minGrade);
            maxGrade=Math.max(w,maxGrade);


        }
        System.out.println(minGrade);
        System.out.println(maxGrade);






    }
}
