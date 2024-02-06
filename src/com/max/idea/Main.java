package com.max.idea;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int a;
        a =nums[0];
        nums[0]=nums [nums.length-1];
        nums[nums.length-1]=a;
        System.out.println(nums[0]+nums[nums.length-3]);

}

}
