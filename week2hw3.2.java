import java.util.*;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 

public class Date {
    
    boolean isValidDate(String sDate) {  
      String datePattern1 = "\\d{4}-\\d{2}-\\d{2}";  
      String datePattern2 = "^((\\d{2}(([02468][048])|([13579][26]))" 
              + "[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|" 
              + "(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?" 
              + "((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?(" 
              + "(((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?" 
              + "((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";  
      if ((sDate != null)) {  
          Pattern pattern = Pattern.compile(datePattern1);  
          Matcher match = pattern.matcher(sDate);  
          if (match.matches()) {  
              pattern = Pattern.compile(datePattern2);  
              match = pattern.matcher(sDate);  
              return match.matches();  
          }  
          else {  
              return false;  
          }  
      }  
      return false;  
    }
    void print(String s){
        System.out.println(s+"正確!!");
    }
    public static void main(String[] args) {
        boolean x;
        String  da;
        System.out.print("請輸入日期判斷是否為正確日期(格式：YYYY-MM-DD)：");
        Scanner s   =   new Scanner(System.in);
        da          =   s.nextLine();
        Date d  =   new Date();
        x       =   d.isValidDate(da);
        if(x==false)
            System.out.println("輸入格式錯誤!!");
        else
            d.print(da);
    }
}

