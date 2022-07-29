public class MissingNum {
    public static void missingNumber(int []arr, int count){
        int sum=0, allSum=0;
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("sum of the array "+sum);

        for (int j=1;j<count;j++){
            allSum+= j;
        }
        System.out.println("sum of all the integers from limit "+allSum);
        int missingNum= allSum-sum;
        System.out.println("missing number in the array "+missingNum);
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,6};
        missingNumber(a,97);
    }


}
