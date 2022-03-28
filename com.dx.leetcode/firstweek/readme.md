保序操作数组类的题目可以考虑用过滤器，以下为解决这类题目的模板

public int removeDuplicates(int[] nums) {
int n = 0 ;
for (int i = 0; i < nums.length; i++) {
//这里的if条件表示要还是不要，即过滤器
if (condition) {
nums[n] = nums[i];
n++;
}
}
return n;
}
