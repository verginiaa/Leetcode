public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0, partSum = 0, count = 0,  i = 0;

        for(int num : A){ sum += num; }

        while(i < A.length){

            partSum+=A[i];
            if(partSum == sum/3){
                count++;
                partSum = 0;
            }

            i++;
        }

        return count >= 3;
    }
}
