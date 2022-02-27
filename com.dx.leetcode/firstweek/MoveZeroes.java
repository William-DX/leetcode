public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        //filter模版
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[n++] = nums[i];
            }
        }
        //补0
        if (n < nums.length) {
            for (int j = n; j < nums.length; j++) {
                nums[j] = 0;
            }
        }
    }
}
