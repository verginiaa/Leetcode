public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int []array=new int[S.length()+1];
        int d=S.length();
        int i=0;
        boolean visited[]=new boolean[S.length()+1];
        for(int j=0;j<S.length();j++){
            if(S.charAt(j)=='I') {
                array[j] = i;
                visited[i]=true;
                i++;
            }else{
                array[j]=d;
                visited[d]=true;
                d--;
            }
        }
        int index=-1;
        for(int j=0;j<visited.length;j++){
            if(visited[j]==false)
                index=j;
        }
        array[array.length-1]=index;
        return array;

    }
}
