public class SwapEndsKata {

    public int[] swapEnds(int[] nums) {
        int intStore = nums[0];
        int lastOne = nums[nums.length-1];
        nums[0] = lastOne;
        nums[nums.length-1] = intStore;

        return nums;

    }

}
