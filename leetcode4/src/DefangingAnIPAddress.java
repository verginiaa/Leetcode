public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String res=new String();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)!='.')
                res+=address.charAt(i);
            else
                res+="[.]";
        }
            return res;
    }
}
