public class BinaryGap {
    public int binaryGap(int N) {
        int prev=-1,curr=-1,max=0;
        String str=Integer.toBinaryString(N);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                if(prev==-1)
                    prev=i;
                else {
                    curr=i;
                }
                if(curr!=-1&&prev!=-1)
                    max=Math.max(curr-prev,max);
                prev=curr;
            }
        }
        return max;
    }
}
