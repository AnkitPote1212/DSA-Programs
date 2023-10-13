import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

   void printOccurance(String string) {
    Map<Character,Integer> map=new HashMap<>();
    for(char c:string.toCharArray()){
      if(map.containsKey(c)){
        int temp=map.get(c);
        map.put(c,++temp);
      }else{
        map.put(c,1);
      }
    }
    System.out.println(map);
  }
  public static void main(String[] args) {
    CharacterOccurance obj=new CharacterOccurance();
    obj.printOccurance("AAAnkitt");
  }

 
}
