public class Maximum69Number {
    public int maximum69Number (int num) {
        String temp=String.valueOf(num);
        char[]array=temp.toCharArray();

        for(int i=0;i<array.length;i++){
            if(array[i]=='6') {
                array[i] = '9';
                break;
            }
        }
        temp="";
        for(int i=0;i<array.length;i++)
            temp+=array[i];
        return Integer.parseInt(temp);

    }
}
