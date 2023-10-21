package GFGCourse.Recurssion;

public class FibonachiRecussion {
  private static int printFibonachi(int n) {
    if(n<=1)
    return n;
    else
    return printFibonachi(n-1) + printFibonachi(n-2);
  }
  public static void main(String[] args) {
    for(int i=0;i<10;i++){
    System.out.print(printFibonachi(i)+" ");
    }
  }
}
