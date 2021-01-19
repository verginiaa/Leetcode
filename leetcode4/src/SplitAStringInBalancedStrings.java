public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int tot=0;
        int l=0,r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                r++;
            else
                l++;
            if(r==l){
                tot++;
                l=0;
                r=0;
            }
        }
        return tot;

    }
}
