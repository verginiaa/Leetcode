class Solution {
    public int longestPalindrome(String s) {
        int sum=0;
        if(s.length()==0)
            return 0;
        int array[]=new int[26*2];
        int odd=0;
        boolean same=true;
        char pre=s.charAt(0);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z')
                array[c-'a']++;
            else
                array[c-'A'+26]++;
            if(c!=pre)
                same=false;
            pre=c;
        }
        if(same){
            if(pre>='a'&&pre<='z')
                return array[pre-'a']++;
            else
                return array[pre-'A'+26]++;
        }
        for(int i=0;i<array.length;i++) {
            if(array[i]==1)
                odd=1;
            if(array[i]%2==0)
                sum+=array[i];
            else if(array[i]%2==1&&array[i]>1){
                sum+=(array[i]-1);
                odd=1;
            }
        }

        return sum+odd;
    }
}