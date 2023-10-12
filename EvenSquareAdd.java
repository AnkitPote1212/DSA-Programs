/*int a[] = { 1,2,3,4,5,6,7,8,9,10}

And print the addition of sqaures of all even numbers.

*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class EvenSquareAdd {
  public static void main(String[] args) {
    int a[] = { 1,2,3,4,5,6,7,8,9,10};
    int sum=0;
    sum=Arrays.stream(a).filter(i->(i%2==0)).map(i->i*i).sum();
    System.out.println(sum);
  }
}
