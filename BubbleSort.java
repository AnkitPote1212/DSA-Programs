import java.util.Arrays;

public class BubbleSort {

  int[] sort(int[] arr, int n) {
    boolean swapped=false;
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
          swapped=true;
        }
      }
      if(swapped==false){
        break;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    BubbleSort b=new BubbleSort();
    int arr[]={484,8,84,78,77,788,45,86};
    Arrays.stream(b.sort(arr,arr.length)).   forEach(System.out::println);
  }
}
