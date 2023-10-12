import java.util.ArrayList;
import java.util.Collection;

class CustomArrayListImpl<T> extends ArrayList<T>{
@Override
public boolean add(T item){
  if(!contains(item)){
    super.add(item);
    return true;
  }
  return false;
}
@Override
public void add(int x,T item){
  if(!contains(item)){
    super.add(x,item);
  }
}
@Override
public boolean addAll(Collection<? extends T> collection){
  return super.addAll(size(),collection);
}

@Override
public boolean addAll(int x,Collection<? extends T> collection){
  ArrayList<T> temp=new ArrayList<>();
  for(T i:collection){
    if(!contains(i)){
      temp.add(i);
    }
  }
  return super.addAll(x, temp);
}  
}
class CustomArrayList{
  public static void main(String[] args) {
    CustomArrayListImpl<Integer> obj=new CustomArrayListImpl<>();
    obj.add(10);
    obj.add(10);
    obj.add(20);
    obj.add(10);
    System.out.println(obj);
  }
  
}
