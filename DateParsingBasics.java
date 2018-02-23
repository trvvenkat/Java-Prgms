import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsingBasics {

    public static void main(String args[]){
        SimpleDateFormat sdf = new SimpleDateFormat () ;
        sdf.applyPattern("MM/dd/yyyy") ;
        sdf.setLenient(false) ;
        try {
            Date d = sdf.parse("1996/02/02") ;
            System.out.println(d) ;
        } catch (ParseException e) {
            System.out.println (e.getMessage()) ;
        }
    }

}