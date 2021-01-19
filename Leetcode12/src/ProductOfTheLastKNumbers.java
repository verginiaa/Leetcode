import java.util.ArrayList;
import java.util.List;

public class ProductOfTheLastKNumbers {
    class ProductOfNumbers {
        private int product = 1;
        private final List<Integer> nums = new ArrayList<>();

        public void add(int num) {
            if (num == 0) {
                nums.clear();
                product = 1;
            } else {
                product *= num;
                nums.add(product);
            }
        }

        public int getProduct(int k) {
            if (k == nums.size()) return product;
            return nums.size() - k < 0 ? 0 : product / nums.get(nums.size() - k - 1);
        }


    }

}
