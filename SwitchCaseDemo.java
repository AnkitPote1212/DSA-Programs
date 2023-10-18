import java.util.Scanner;

public class SwitchCaseDemo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String dayNo=sc.next();
    String dayName;
    switch (dayNo){
      case "Mon":
      dayName="Monday";
      break;
      case "Tue":
      dayName="Tuesday";
      break;
      case "Wen":
      dayName="Wenesday";
      break;
      default:
      dayName="Invalid dayNo";
}
System.out.println(dayName);
  }
  
}
