public class MaxWaterContainer {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int area=0;
        while(l<r){
            int h=Math.min(heights[l],heights[r]);
            int temp = h*(r-l);
            area = Math.max(area, temp);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return area;
    }
}


/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
