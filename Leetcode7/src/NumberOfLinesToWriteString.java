public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int lines=0;
        int width=0;
        int[]array=new int[2];
        for(int i=0;i<S.length();i++){
            int w=widths[S.charAt(i)-'a'];
            width+=w;
            if(width>100){
                lines++;
                width=width-100;
            }
        }
        array[0]=lines;
        array[1]=width;
        return array;

    }
}
