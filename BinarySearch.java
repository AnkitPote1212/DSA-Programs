public class BinarySearch {
   int findNumber(int[] arr, int start, int end,int item) {
    while(end>start){
      int mid=(start+end)/2;
      if(arr[mid]==item){
        return mid;
      }
      else if(item>arr[mid]){
        start=mid+1;
      }else if(item<arr[mid]){
        end=end-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={28,85,88,95,125,130,135,145,150,155,180,195,205,202,207};
    int length=arr.length;
    BinarySearch b=new BinarySearch();
    int index=b.findNumber(arr,0,length-1,407);
    if(index==-1){
      System.out.println("Not Found");
    }else{
      System.out.println(index+" "+arr[index]);
    }

  }
}
