package GFGCourse;

//n=78987
///yes
//n=8
//yes
//n=58
// no
public class PalindromeNumber {
  static int checkPalindrome(int n){
    int temp=n;
    int rev=0;
    while(temp>0){
      rev=rev*10;
      rev=rev+temp%10;
      temp=temp/10;
    }
    return rev;
  }
  public static void main(String[] args) {
    int n=1210;
    if(PalindromeNumber.checkPalindrome(n)==n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
