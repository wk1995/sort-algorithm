package com.wk.sort

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/04/22
 *      desc   :
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 * </pre>
 */
class QuickSort : Sort() {
    override fun sort(nums: IntArray) {
        val first = 0
        val last = nums.size - 1
        sort(nums, first, last)
    }

    private fun sort(nums: IntArray, first: Int, last: Int) {
        if (first >= last) return
        var x = first
        var i = first
        var j = last
        while (i < j) {
            while (nums[x] < nums[j] && i < j) {
                j--
            }
            if(i < j) {
                nums[x] = nums[x] xor nums[j]
                nums[j] = nums[x] xor nums[j]
                nums[x] = nums[x] xor nums[j]
                x = j
            }
            while (nums[x] > nums[i] && i < j)
                i++
            if(i < j) {
                nums[x] = nums[x] xor nums[i]
                nums[i] = nums[x] xor nums[i]
                nums[x] = nums[x] xor nums[i]
                x = i
            }

        }
        sort(nums, first, x)
        sort(nums, x + 1, last)
    }
}