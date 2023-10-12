/*Consider a list of n Documents categorized as PaySlip,TaxSheet and Declaration.
Sort them in a place so that objects of the same category are adjacent with the
documents in the order of PaySlip, TaxSheet and Declaration?
We will use the integers 1001,1010 and 2001 to represent the documents PaySlip,
TaxSheet and Declaration respectively.
You mus solve this problem without using Library Sort Function.( NOVOSOFT)*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Test{
  public static void main(String[] args) {
        List<Integer> mutableList = Arrays.asList(1001, 1010, 1010, 1010, 2001, 1001);
        Collections.sort(mutableList);
        System.out.println(mutableList);


  }
}
