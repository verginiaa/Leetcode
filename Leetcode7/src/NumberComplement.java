public class NumberComplement {
    public int findComplement(int num) {
        String comp=Integer.toBinaryString(num);
        String last=new String();
        for(int i=0;i<comp.length();i++){
            if(comp.charAt(i)=='0')
                last+=1;
            else
                last+=0;
        }
        System.out.println(last);
        return Integer.parseInt(last,10);

    }
}
