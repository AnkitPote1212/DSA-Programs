package GFGCourse;

public class FactorialRecursive {

  public static int factRecursive(int i) {
    if(i==0){
      return 1;
    }
    return i*factRecursive(i-1);
  }
  public static void main(String[] args) {
    System.out.println(FactorialRecursive.factRecursive(5));
  }
  
}
