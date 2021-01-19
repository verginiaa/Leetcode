public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int[]result=new int[2];
        double sq=Math.sqrt(area);
        if(area%sq==0&&sq!=1){
            result[0]=(int)sq;
            result[1]=(int)sq;
        }else{
            while (area%sq!=0)
                sq--;
            result[0]= (int) ((int)area/sq);
            result[1]= (int) sq;
        }
        return result;
    }
}
