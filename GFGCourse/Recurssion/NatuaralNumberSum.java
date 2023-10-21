package GFGCourse.Recurssion;

//n=2 sum=3
//n=4 sum=10
public class NatuaralNumberSum {

    private static int natuaralSum(int n) {
      if(n==1)
      return 1;

    return n+natuaralSum(n-1);
  }
  public static void main(String[] args) {
    System.out.println(natuaralSum(2));
  }
}
