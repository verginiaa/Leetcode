import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length/3;
        int tot=0,i=piles.length-2;
        while (n-->0){
            tot+=piles[i];
            i-=2;
        }
        return tot;
    }
}
