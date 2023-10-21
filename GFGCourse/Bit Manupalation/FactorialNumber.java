package GFGCourse;

public class FactorialNumber {
  static int fact(int n){
    int fact=1;
    while(n>=2){
      fact=fact*n;
      n=n-1;
    }
    return fact;
  }
  public static void main(String[] args) {
    System.out.println(FactorialNumber.fact(6));
  }
 
}
