/*8.	Program: take matrix
1 2 3
4 5 6
7 8 9
And print addition of each row into last column and addition of column into last row.

Expected o/p:

1 2 3 6
4 5 6 15
7 8 9 24
12 15 18 45
 */

public class MatrixManipulation {
  public static void main(String[] args) {
    int[][] arr=new int[4][4];
    int count=1;
    // for(int i=0;i<3;i++){
    //   for(int j=0;j<3;j++){
    //     System.out.print(count+" ");
    //     arr[i][j]=count++;
    //   }
    //   System.out.println();
    // }
    System.out.println();
    System.out.println();
    int sum=0;
    for(int i=0;i<4;i++){
      for(int j=0;j<4;j++){
        if(j==3){
          System.out.print(sum+" ");
          sum=0;
        }else{
          System.out.print(count+" ");
          arr[i][j]=count++;
        }
        sum=sum+arr[i][j];
      }
      System.out.println();
    }

  }
}
