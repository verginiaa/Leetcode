public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int cnt=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' ') cnt++;
        }
        if(s.charAt(s.length()-1)!=' ')
            cnt++;
        return cnt;

    }
}
