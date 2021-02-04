public class MinimumDeletionCostToAvoidRepeatingLetters {
        public int minCost(String s, int[] cost) {
            int finalCost=0,i=0,j=1;

            while (i<s.length()-1&&j<s.length()){
                if(s.charAt(i)==s.charAt(j)){
                    if(cost[i]<cost[j]){
                        finalCost+=cost[i];
                        i=j;
                        j++;
                    }
                    else{
                        finalCost+=cost[j];
                        j++;
                    }
                }
                else{
                    i=j;
                    j++;
                }
            }
            return finalCost;
        }
    }
