public class PalindromicSubstrings {
    public int countSubstrings(String s) {

        int output=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                output+=isPalindrome(s,i,j);
            }
        }
        return output;

    }

    public int isPalindrome(String string,int start,int end){
        while (start<end){
            if(string.charAt(start)!=string.charAt(end)) return 0;
            start++;
            end--;
        }
        return 1;
    }
}
