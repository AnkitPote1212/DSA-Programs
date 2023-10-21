package GFGCourse.bitManupation;
//GCD of two numbers is the largest number which can divide the both the numbers
// a=4 b=6 gcd=2
//a=100 b=200 gcd=100
//optimized version = gcd(a,b)=gcd(a-b,b)
public class Gcd {
   private static int findGcd(int a, int b) {
    while(a!=b){
      if(a>b)
        a=a-b;
      else
        b=b-a;
    }
    return a;
  }
  public static void main(String[] args) {
    System.out.println(Gcd.findGcd(10,9));
  }
}
