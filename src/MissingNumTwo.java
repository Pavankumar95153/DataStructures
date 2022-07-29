public class MissingNumTwo {
    public static int calculate(int [] numbers){
        int sum=0;
        for( int n: numbers){
            sum +=n;
        }
        return sum;
    }

  public static void main(String[] args) {
      int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};

      int N = numbers[numbers.length-1];
      int idealSum = (N * (N + 1)) / 2;
      int sum = calculate(numbers);

      int missingNumber = idealSum - sum;
      System.out.println(missingNumber);
  }
}
