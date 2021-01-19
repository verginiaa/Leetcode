public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int zB=0,ze=0,zeroes=0,i=0;
        while (i<seats.length&&seats[i]!=1) {
            zB++;
            i++;
        }
        int j=seats.length-1;
        while (j>=0&&seats[j]!=1) {
            ze++;
            j--;
        }
        int max=Math.max(zB,ze);
        int max1=0;
        for(int k=i;k<j;k++){
            if(seats[k]==0)
                zeroes++;
            else {
                zeroes=0;
                max1=Math.max(max1,zeroes);
            }
        }

        return (int) Math.max(max,Math.ceil(max1/2));

    }
}
