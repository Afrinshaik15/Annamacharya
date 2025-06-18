public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0; // No water can be trapped if less than 3 bars
        }
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int waterTrapped = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                waterTrapped += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                waterTrapped += rightMax - height[right];
                right--;
            }
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped water for height1: " + solution.trap(height1)); // Output: 6
        System.out.println("Trapped water for height2: " + solution.trap(height2)); // Output: 9
    }
}