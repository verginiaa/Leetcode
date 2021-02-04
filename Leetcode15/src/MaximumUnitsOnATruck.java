import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++){
            for(int j=0;j<boxTypes[i].length;j++)
                System.out.println(boxTypes[i][j]);
        }
        int output=0;
        for(int i=0;i<boxTypes.length&&truckSize>0;i++){
            int boxesNumber=boxTypes[i][0];
            int units=boxTypes[i][1];
            if(boxesNumber<=truckSize)
                output+=(boxesNumber*units);
            else output+=(truckSize*units);

            truckSize-=boxesNumber;
        }
        return output;
    }
}
