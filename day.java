
import java.text.SimpleDateFormat;

public class day {
    public static void main(String args[]){

        if(args.length ! = 1){

            System.out.println("usage : java Dayweekfinder<date> ");
            System.out.println("Date format : YYYY-MM-DD");
            return;
        }
        String inputDate=args[0];
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
        dateFormat.setLenient(false);
       try{
        Date date=  
       }
    }
    
}
