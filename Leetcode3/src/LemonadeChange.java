public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        boolean result=true;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)
                five++;
            else if(bills[i]==10){
                if(five==0)
                    return false;
                else{
                    five--;
                    ten++;
                }
            }else{
                if(ten>0&&five>0) {
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }else{
                 return false;
                }
            }
        }
        return true;
    }
}
