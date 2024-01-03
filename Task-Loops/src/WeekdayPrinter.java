public class WeekdayPrinter {
    public static void main(String[] args) throws Exception {
      
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < days.length; i++) {
      if(days[i].equals("Friday") ||  days[i].equals("Saturday"))
      break;
      
      else System.out.println(days[i]);

        }
    }
}
