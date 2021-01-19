public class PlusOne { public static void main(String[]args){
    PlusOne o=new PlusOne();
    System.out.println(o.plusOne(new int[]{1, 2, 3}));
}
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        if(digits[0]==0){
            int out[]=new int[digits.length+1];
            out[0]=1;
            for(int i=1;i<digits.length;i++)
                out[i]=digits[i];
            return out;
        }
        else
            return digits;    }
}
