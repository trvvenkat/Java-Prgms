import java.text.*;
import java.util.*;

public class DateSample {
    //give args value when you run the program in any of the specified format

    public static final String[] formats = { 
                "yyyyMMdd", "yyyy-MM-dd", "yyyy/MM/dd", 
                "yyyy:MM:dd",   "yyyy,MM,dd", "yyyy.MM.dd", };

        /*
         * @param args
         */
    public static void main(String[] args) {
        String yyyyMMdd = "1996.06.29";   
        parse(yyyyMMdd);
    }

    public static void parse(String d) {
        if (d != null) {
            for (String parse : formats) {
                SimpleDateFormat sdf = new SimpleDateFormat(parse);
                Date da;
                try {
                    da = sdf.parse(d);
                    System.out.println("Printing the value of " + parse);
                    System.out.println(da);
                } catch (ParseException e) {

                }
            }
        }
    }
}