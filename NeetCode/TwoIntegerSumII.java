import java.util.Arrays;

public class TwoIntegerSumII {

    public static void main(String[] args) {
        int [] num =  {1,2,3,4};
        int target = 3 ; 
        int [] res  = twoSum(num, target); 
        System.out.println(Arrays.toString(res));
    }
    public  static int[] twoSum(int[] numbers, int target) {
            int left  = 0  ,  right = numbers.length - 1 ; 
            while (left<right) { 
                int sum  =  numbers[left] + numbers[right];
                if(sum == target) return  new int [] { left + 1 , right + 1};

                if(sum < target)  left ++ ; 
                if(sum > target) right -- ; 
                
            }
            return new int[0];


    }
}
