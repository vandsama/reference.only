package com.techelevator;

public class ArrayUtils {

    /*  Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3}
        yields {2, 3, 1}.

        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

}
