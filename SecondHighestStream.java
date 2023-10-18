import java.util.Arrays;

public class SecondHighestStream {
  public static void main(String[] args) {
    int arr[]={5468,78,789,8,7,88};
    int a=Arrays.stream(arr).sorted().toArray()[arr.length-2];
    System.out.println(a);
  }
  
}
