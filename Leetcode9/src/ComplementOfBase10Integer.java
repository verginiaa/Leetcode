public class ComplementOfBase10Integer {
    public int bitwiseComplement(int N) {
        String str=Integer.toBinaryString(N);
        char[]arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')
                arr[i]='0';
            else arr[i]='1';
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=2*sum+Integer.parseInt(String.valueOf(arr[i]));
        return sum;
    }
}
