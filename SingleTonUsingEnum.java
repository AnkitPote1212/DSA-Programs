enum Abc{
  INSTANCE;
  int i;
  public void print(){
    System.out.println(i);
  }
}
public class SingleTonUsingEnum {
  public static void main(String args[]){
  Abc obj1=Abc.INSTANCE;
  obj1.i=5;
  obj1.print();
  Abc obj2=Abc.INSTANCE;
  obj2.i=6;
  obj1.print();
  }
}

