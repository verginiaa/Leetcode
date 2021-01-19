import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[]temp=heights.clone();
        Arrays.sort(heights);
        int tot=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=temp[i])
                tot++;
        }
    return tot;
    }
}
