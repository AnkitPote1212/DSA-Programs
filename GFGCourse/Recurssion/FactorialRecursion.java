package GFGCourse.Recurssion;

public class FactorialRecursion {

    private static int calFact(int i) {
      if(i==1)
      return 1;
      return i*calFact(i-1);
  }
  public static void main(String[] args) {
    System.out.println(FactorialRecursion.calFact(4));
  }
}
