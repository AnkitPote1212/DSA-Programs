package GFGCourse.bitManupation;

public class TrailZero {
   private static int findTrailCount(int n) {
     int count=0;
     for(int i=5;i<=n;i=i*i){
       count=count+n/i;
     }
     return count;
   }
   public static void main(String[] args) {
     System.out.println(TrailZero.findTrailCount(10));
   }  
}
