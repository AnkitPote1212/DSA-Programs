package GFGCourse.Recurssion;

public class NtoOne {

    private static void printNumber(int i) {
      if(i==0)
      return;
      System.out.println(i);
      printNumber(i-1);
  }
  public static void main(String[] args) {
    NtoOne.printNumber(10);
  }
}
