public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int[]array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=start+2*i;
        int res=0;
      for(int i=0;i<n;i++)
          res^=array[i];
      return res;

    }
}
