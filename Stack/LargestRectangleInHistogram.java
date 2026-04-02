import java.util.*;
public class LargestRectangleInHistogram{
    public static int largestRectangleArea(int[] height){
        int n = height.length;

        Stack<Integer> stack = new Stack<>();
        
        int maxArea = 0; 

        for(int i=0; i<=n;i++){
            int currentHeight = (i==n)?0 : height[i];
            while(!stack.isEmpty()&&currentHeight<height[stack.peek()]){
                int heights = height[stack.pop()];

                int width;

                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek()-1;
                }
                int area = heights*width;
            maxArea = Math.max(maxArea,area);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};

        int result = largestRectangleArea(height);

        System.out.println("Largest Rectangular Area:"+ result);
    }

}
