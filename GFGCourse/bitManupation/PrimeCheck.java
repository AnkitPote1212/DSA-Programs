package GFGCourse.bitManupation;

public class PrimeCheck {

  static boolean cheakPrime(int n){
    if(n==1)
      return false;
    if(n==2 || n==3)
      return true;
    if(n%2==0 || n%3==0)
    return false;
    for(int i=5;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(PrimeCheck.cheakPrime(11));
  }
  
}
