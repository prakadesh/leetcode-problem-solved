class Solution {
    public int maxArea(int[] height) {
        // start point
        int p1 = 0;
        // end point
        int p2 = height.length - 1;
        
        return container(p1, p2, 0, height);
    }
    
    private int container(int p1, int p2, int max, int[] height) {
        // base case. When we finish
        if(p1 == p2 || p1 == height.length - 1 || p2 == 0) {
            return max;
        }
        
        // define the height of start and end line
        int h1 = height[p1];
        int h2 = height[p2];
            
        // minimum height to find a proper container wall
        int minH = Math.min(h1, h2);
        // width of the container is a distace between two walls
        int width = p2 - p1;
            
        // volume of current container
        int cur = minH * width;
        // max volume
        int newMax = Math.max(max, cur);
        
        // for the result of maximum volume of the next step
        int nextStep = 0;
        
        // if first wall is lower that second let's calculate the wolume of cotainer with the next start wall
        if(h1 < h2) {
            nextStep = container(p1 + 1, p2, newMax, height);
        } else {
            // the same for the second wall
            nextStep = container(p1, p2 - 1, newMax, height);
        }
            
        // return maximum
        return Math.max(cur, nextStep);
    }
}
