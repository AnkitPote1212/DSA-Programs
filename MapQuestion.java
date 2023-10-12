/*3.	//program 1:
//write a program for questions as key and answers as their values.
 */

import java.util.*;

public class MapQuestion {
  public static void main(String[] args) {
    Map<String,String> map=new HashMap<>();
    map.put("What is your Name", "Ankit");
    map.put("What is your qualification", "BE");
    for(String i: map.keySet()){
      System.out.println(i);
      System.out.println(map.get(i));
      System.out.println("------------------");
    }
    for(Map.Entry<String,String> entry:map.entrySet()){
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
      System.out.println("------------------------------");
    }
    
  }
}
