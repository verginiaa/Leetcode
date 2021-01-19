public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0],y1=rec1[1],x2=rec1[2],y2=rec1[3];
        int xx1=rec2[0],yy1=rec2[1],xx2=rec2[2],yy2=rec2[3];
        if(xx1>=x2||xx2<=x1)
            return false;
        else if(yy2<=y1||yy1>=y2)
            return false;
        return true;
    }
}
