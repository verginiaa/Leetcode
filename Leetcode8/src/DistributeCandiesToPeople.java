public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {
        int[]a=new int[num_people];
        int i=0,j=1;
        while (candies>0){
            if(i==a.length)
                i=0;
            if(j>candies){
                a[i]+=candies;
                break;
            }
            a[i]+=j;
            candies-=j;
            j++;

          i++;
        }

        return a;

    }
}
