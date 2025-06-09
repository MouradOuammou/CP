public class  ContainerWithMostWater {
    public static void main(String[] args) {
            int [] test  = {1,8,6,2,5,4,8,3,7};
            System.out.println(maxArea(test));
            System.out.println(test.length);
    }
     public static  int maxArea(int[] height) {
         int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {

      int area =
          Math.min(height[left], height[right])
          * (right - left);
        System.out.println(area);
      maxArea = Math.max(area, maxArea);
              System.out.println("max area :"+maxArea);


      if (height[left] < height[right])
        left++;
      else
        right--;
    }

    return maxArea;
  }

}
