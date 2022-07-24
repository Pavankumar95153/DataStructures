import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSumPair{
  public static void main(String[] args) {
      Integer a[] = {8, 7, 2, 5, 3, 1};
    List<Integer> list = Arrays.asList(a);
      Collections.sort(list);
      System.out.println(list);
      for(int i=0;i<list.size();i++){
          for(int j = i+1; j<list.size();j++){
              if(list.get(i) != list.get(j)){
                  Integer aint = list.get(i);
                  Integer bint = list.get(j);
                  Integer cint = aint+bint;
                  if(cint == 10){
                      System.out.println("pair of values of list are "+list.get(i)+","+list.get(j));
                      break;
                  }

              }
          }

      }

  }
}


/*
[1, 2, 3, 5, 7, 8]
pair of values of list are 2,8
pair of values of list are 3,7

 */

/*
*public static void findPair(int [] nums,int target){
        for(int i = 0;i<nums.length-1;i++){
            for(int j= i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
          System.out.println("find the pair of value"+nums[i]+""+nums[j]);
        } else System.out.println("unable to find the pair of value");
            }
        }


    }
    public static void main(String[] args) {
        int a[]= {8, 7, 5, 3, 2, 1};
        int target = 10;
        findPair(a,10);
    }
*
*
 */