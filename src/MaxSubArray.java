public class MaxSubArray {
    public static int kadana(int[]a){
        int maxSoFar=0;
        int maxEndingHere =0;
        for(int i:a){
            maxEndingHere = maxEndingHere+i;
            maxEndingHere = Integer.max(maxEndingHere,0);
            maxSoFar = Integer.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }

  public static void main(String[] args) {
        int A[]={1,2,-1,-2,3,4,-5};
    System.out.println("The sum of contiguous subarray with the " +
            "largest sum is " + kadana(A));
  }
}

/**
 * The sum of contiguous subarray with the largest sum is 7
 * */
