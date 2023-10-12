public class OneToTweentyRecursion {
int print20(int n){
  if(n>20){
    return n;
  }else{
    System.out.println(n);
    print20(n+1);
  }
  return 0;
}
 public static void main(String[] args) {
  OneToTweentyRecursion obj=new OneToTweentyRecursion();
  //System.out.println(obj.print20(20));
  obj.print20(1);
 } 
}
