public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps (int num) {
        int tot=0;
        while (num>0){
            while (num%2==0&&num>0) {
                tot++;
                num /= 2;
            }
            if(num==0)
                break;
            else {
                num--;
                tot++;
            }
        }
return tot;
    }
}
