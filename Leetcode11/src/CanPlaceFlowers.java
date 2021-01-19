public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=0;
        if(flowerbed.length==1&&flowerbed[0]==0)
            return 1>=n;
        else if(flowerbed.length==1&&flowerbed[0]==1)
            return 0>=n;
        if(flowerbed.length>1) {
            if (flowerbed[0] != 1 && flowerbed[1] != 0) {
                cnt++;
                flowerbed[0] = 1;
            }
            if (flowerbed[flowerbed.length - 1] != 1 && flowerbed[flowerbed.length - 2] != 1) {
                cnt++;
                flowerbed[flowerbed.length - 1] = 1;
            }
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0&&flowerbed[i-1]!=1&&flowerbed[i+1]!=1) {
                cnt++;
                flowerbed[i] = 1;
            }
        }

        return cnt>=n;

    }
}
