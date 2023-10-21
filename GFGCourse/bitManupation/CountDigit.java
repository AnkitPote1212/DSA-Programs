package GFGCourse;


//x=5849 op=4
//23=2
public class CountDigit {
  static int count(int n){
    int count=0;
    while(n>0){
      count++;
      n=n/10;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(CountDigit.count(5486));
  }
  
}
