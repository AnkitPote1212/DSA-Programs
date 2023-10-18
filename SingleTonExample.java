public class SingleTonExample {
  public static SingleTonExample singleObj=null;
  private SingleTonExample(){

  }
  public static SingleTonExample getObject(){
    if(singleObj==null){
      singleObj=new SingleTonExample();
    }
    return singleObj;
  }
  
}
