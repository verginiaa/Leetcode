public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            boolean found=false;
            int j;
            for( j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]) {
                    found=true;
                    break;
                }
            }
            if(found){
                prices[i]-=prices[j];
            }
        }
        return prices;
    }
}
