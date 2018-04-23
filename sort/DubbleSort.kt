package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/21
 *      desc   : 冒泡排序：（升序）从第一个数开始，跟下一个对比
 *               如果比它大，则调换位置，然后以第二个数跟下一个对比，直到求出最大的数
 *               重复该操作
 *               然后再从第一个数开始，重复操作
 *               时间复杂度：最差的情况下，需要执行n(n-1)/2次
 *               空间复杂度：O(1)
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class DubbleSort : Sort() {
    override fun sort(nums: IntArray) {
        for (i in nums.size-1 downTo 1)
            for (j in 0 until i)
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j + 1] xor nums[j]
                    nums[j + 1] = nums[j] xor nums[j + 1]
                    nums[j] = nums[j + 1] xor nums[j]
                }

    }
}