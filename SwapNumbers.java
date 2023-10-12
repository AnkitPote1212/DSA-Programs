public class SwapNumbers {
  int x=10;
  int y=20;
  void swap(){
    x=x+y;
    y=x-y;
    x=x-y;
  }
  public static void main(String[] args) {
    SwapNumbers obj=new SwapNumbers();
    System.out.println(obj.x+ " "+obj.y);
    obj.swap();
    System.out.println(obj.x+ " "+obj.y);
  }
}
