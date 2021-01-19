public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int i=0,j=s.length();
        while (i<j&&i<s.length()&&j>=0){
            while (i<s.length()&&!isVowel(s.charAt(i)))
                i++;
            while (j>=0&&!isVowel(s.charAt(j)))
                j--;
            if(i<j&&s.charAt(i)!=s.charAt(j))
                s=swap(s,i,j);
            i++;
            j--;
        }
        return s;

    }
    static boolean isVowel(char c){
        if(c=='a'||c=='A'||c=='i'||c=='I'||c=='e'||c=='E'||c=='o'||c=='O'||c=='u'||c=='U')
            return true;
        return false;
    }
    public String swap(String s, int i0, int i1) {
        String s1 = s. substring(0, i0);
        String s2 = s. substring(i0+1, i1);
        String s3 = s. substring(i1+1);
        return s1+s. charAt(i1)+s2+s. charAt(i0)+s3;
    }
}
