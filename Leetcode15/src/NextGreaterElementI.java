import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack=new Stack<>();
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        int[]output=new int[nums1.length];
        for(int number : nums2){
            while (!stack.isEmpty()&&number>stack.peek())
                hashMap.put(stack.pop(),number);
            stack.push(number);
        }

        for (int i=0;i<nums1.length;i++){
            output[i]=hashMap.getOrDefault(nums1[i],-1);
        }
        return output;
    }
}
